import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Battle {
    // Player player1;
    // Player player2;

    // ArrayList<Character> player1Army;
    // ArrayList<Character> player2Army;

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<ArrayList<Character>> armies = new ArrayList<>();

    int attackPlayer;
    int defendPlayer;

    public Battle(Player player1, Player player2) {
        // this.player1 = player1;
        // this.player2 = player2;

        // player1Army = player1.getArmy();
        // player2Army = player2.getArmy();

        players.add(player1);
        players.add(player2);

        armies.add(player1.getArmy());
        armies.add(player2.getArmy());
    }

    public void start() throws InterruptedException {

        setHomelandStats();
        sortArmies();

        System.out.println(
                "\nBattle started between " + players.get(0).getName() + " and " + players.get(1).getName() + "\n");

        // loop 20 times
        for (int i = 0; i < 20; i++) {
            attackPlayer = i % 2;
            defendPlayer = attackPlayer == 0 ? 1 : 0;

            // print turn and attacker name
            System.out.println("Turn " + (i + 1) + ": " + players.get(attackPlayer).getName());

            Character attacker = getAttacker(armies.get(attackPlayer));
            Character defender;

            if (attacker instanceof Healer) {
                defender = getLowestHealth(armies.get(attackPlayer));
                heal(attacker, defender, 1);
            } else {
                defender = getLowestDefence(armies.get(defendPlayer));
                attack(attacker, defender, 1);
            }

            String homeground = players.get(1).getHomeground().getName();

            if (homeground == "Arcane" && attacker.getCategory() == "Mystics") {
                attacker.setBattleHealth(roundToFirstDecimal(attacker.getBattleHealth() * 1.1));
            }

            System.out.println(defender.getName() + "'s Health: " + defender.getBattleHealth());
            System.out.println(attacker.getName() + "'s Health: " + attacker.getBattleHealth());

            if (defender.getBattleHealth() == 0) {
                System.out.println(defender.getName() + " died!");
                armies.get(defendPlayer).remove(defender);
                if (armies.get(defendPlayer).size() < 1) {
                    endBattle(attackPlayer, defendPlayer);
                    break;
                }
            }

            System.out.println("------------------------");

            if (homeground == "Hillcrest" && attacker.getCategory() == "Highlanders") {
                System.out.println("Bonus Turn : " + players.get(attackPlayer).getName());
                defender = getLowestHealth(armies.get(attackPlayer));
                if (attacker instanceof Healer) {
                    defender = getLowestHealth(armies.get(attackPlayer));
                    heal(attacker, defender, 0.2);
                } else {
                    defender = getLowestDefence(armies.get(defendPlayer));
                    attack(attacker, defender, 0.2);
                }

                System.out.println(defender.getName() + "'s Health: " + defender.getBattleHealth());
                System.out.println(attacker.getName() + "'s Health: " + attacker.getBattleHealth());

                System.out.println("------------------------");

            }
            Thread.sleep(1000);
        }

        // if no one wins, print draw
        if (armies.get(0).size() != 0 && armies.get(1).size() != 0) {
            System.out.println("Draw!");
        }

        printStats();



    }

    public void attack(Character attacker, Character defender, double factor) {
        double damage = roundToFirstDecimal(
                (0.5 * attacker.getBattleAttack() - 0.1 * defender.getBattleDefence()) * factor);

        double battleHealth = roundToFirstDecimal(defender.getBattleHealth() - damage);

        if (battleHealth < 0) {
            battleHealth = 0;
        }
        defender.setBattleHealth(battleHealth);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage");
    }

    public void heal(Character healer, Character toBeHealed, double factor) {
        double healHealth = roundToFirstDecimal(0.1 * healer.getBattleAttack() * factor);
        toBeHealed.setBattleHealth(roundToFirstDecimal(toBeHealed.getBattleHealth() + healHealth));

        System.out
                .println(healer.getName() + " heals " + toBeHealed.getName() + " with " + healHealth + " health");
    }

    public Character getAttacker(ArrayList<Character> army) {
        Character attacker = army.remove(0);
        army.add(attacker);
        return attacker;
    }

    public Character getLowestDefence(ArrayList<Character> army) {
        Character lowestDefence = army.get(0);
        for (Character character : army) {
            if (character.getBattleDefence() < lowestDefence.getBattleDefence()) {
                lowestDefence = character;
            } else if (character.getBattleDefence() == lowestDefence.getBattleDefence()) {
                List<String> priorityOrder = List.of("Healer", "MythicalCreature", "Archer", "Knight", "Mage");
                int index1 = priorityOrder.indexOf(character.getType());
                int index2 = priorityOrder.indexOf(lowestDefence.getType());
                if (index1 < index2) {
                    lowestDefence = character;
                }
            }
        }
        return lowestDefence;
    }

    public Character getLowestHealth(ArrayList<Character> army) {
        Character lowestHealth = army.get(0);
        for (Character character : army) {
            if (character.getBattleHealth() < lowestHealth.getBattleHealth() && character.getType() != "Healer") {
                lowestHealth = character;
            }
        }
        return lowestHealth;
    }

    public void sortArmies() {
        for (ArrayList<Character> army : armies) {
            Collections.sort(army, Comparator
                    .comparingDouble(Character::getBattleSpeed)
                    .reversed()
                    .thenComparing((character1, character2) -> {
                        String type1 = ((Character) character1).getType();
                        String type2 = ((Character) character2).getType();
                        // Define priority order
                        List<String> priorityOrder = List.of("Archer", "Knight", "MythicalCreature", "Mage", "Healer");
                        int index1 = priorityOrder.indexOf(type1);
                        int index2 = priorityOrder.indexOf(type2);
                        return Integer.compare(index1, index2);
                    }));
        }
    }

    public void setHomelandStats() {
        String homeground = players.get(1).getHomeground().getName();
        for (ArrayList<Character> army : armies) {
            for (Character character : army) {
                switch (homeground) {
                    case "Hillcrest":
                        switch (character.getCategory()) {
                            case "Highlanders":
                                character.setBattleAttack(character.getBattleAttack() + 1);
                                character.setBattleDefence(character.getBattleDefence() + 1);
                                break;
                            case "Sunchildren":
                            case "Marshlanders":
                                character.setBattleSpeed(character.getBattleSpeed() - 1);
                                break;
                        }
                        break;
                    case "Marshland":
                        switch (character.getCategory()) {
                            case "Marshlanders":
                                character.setBattleDefence(character.getBattleDefence() + 2);
                                break;
                            case "Sunchildren":
                                character.setBattleAttack(character.getBattleAttack() - 1);
                                break;
                            case "Highlanders":
                                character.setBattleSpeed(character.getBattleSpeed() - 1);
                                break;
                        }
                        break;
                    case "Desert":
                        switch (character.getCategory()) {
                            case "Marshlanders":
                                character.setBattleHealth(character.getBattleHealth() - 1);
                                break;
                            case "Sunchildren":
                                character.setBattleAttack(character.getBattleAttack() + 1);
                                break;
                        }
                    case "Arcane":
                        switch (character.getCategory()) {
                            case "Mystics":
                                character.setBattleAttack(character.getBattleAttack() + 2);
                                break;
                            case "Marshlanders":
                            case "Highlanders":
                                character.setBattleSpeed(character.getBattleSpeed() - 1);
                                character.setBattleDefence(character.getBattleDefence() - 1);
                                break;
                        }
                    default:
                        break;
                }
            }
        }
    }

    public void resetAllBattleStats() {
        for (ArrayList<Character> army : armies) {
            for (Character character : army) {
                character.resetBattleStats();
            }
        }
    }

    public void printCharacter(Character character) {
        System.out.println(
                character.getName() + ": A: " + character.getBattleAttack() + " D: " + character.getBattleDefence()
                        + " S: " + character.getBattleSpeed() + " H: " + character.getBattleHealth());
    }

    public void printStats() {
        for (Player player : players) {
            System.out.println(player.getName() + " XP: " + player.getXP() + " gold coins: " + player.getGold());
        }
    }

    public void endBattle(int winnerIndex, int loserIndex) {
        Player winner = players.get(winnerIndex);
        Player loser = players.get(loserIndex);

        System.out.println(winner.getName() + " won!");

        winner.addXP();
        int gold = (int) Math.round(loser.getGold() * 0.1);
        winner.setGold(winner.getGold() + gold);
        loser.setGold(loser.getGold() - gold);
        resetAllBattleStats();
    }

    public static double roundToFirstDecimal(double number) {
        return Math.round(number * 10.0) / 10.0;
    }
}