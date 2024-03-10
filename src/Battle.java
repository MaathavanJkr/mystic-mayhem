import java.util.ArrayList;

public class Battle {
    // Player player1;
    // Player player2;

    // ArrayList<Character> player1Army;
    // ArrayList<Character> player2Army;

    ArrayList<Player> players = new ArrayList<>();
    ArrayList<ArrayList<Character>> armies = new ArrayList<>();
    int turn = 0;

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

    public void start() {

        setHomelandStats();

        System.out.println("Battle started between " + players.get(0).getName() + " and " + players.get(1).getName());

        // loop 20 times
        for (int i = 0; i < 20; i++) {
            int attackPlayer = i % 2;
            int defendPlayer = i % 2 == 0 ? 1 : 0;

            // print turn and attacker name
            System.out.println("Turn " + (i + 1) + ": " + players.get(attackPlayer).getName());
            attack(attackPlayer, defendPlayer);

            if (armies.get(defendPlayer).size() == 0) {
                endBattle(attackPlayer, defendPlayer);
                break;
            }
        }

        // if no one wins, print draw
        if (armies.get(0).size() != 0 && armies.get(1).size() != 0) {
            System.out.println("Draw!");
        }

    }

    public void attack(int attackPlayer, int defendPlayer, double factor) {
        Character attacker = getFastest(armies.get(attackPlayer));

        if (attacker instanceof Healer) {
            Character toBeHealed = getLowestHealth(armies.get(attackPlayer));

            int healHealth = (int) (0.1 * attacker.getAttack() * factor);
            toBeHealed.setBattleHealth(toBeHealed.getBattleHealth() + healHealth);

            System.out
                    .println(attacker.getName() + " heals " + toBeHealed.getName() + " with " + healHealth + " health");

            System.out.println(toBeHealed.getName() + "'s Health: " + toBeHealed.getBattleHealth());
            System.out.println(attacker.getName() + "'s Health: " + attacker.getBattleHealth());
        } else {

            Character defender = getLowestDefence(armies.get(defendPlayer));

            int damage = (int) ((0.5 * attacker.getAttack() - 0.1 * defender.getDefence())*factor);
            int battleHealth = defender.getBattleHealth() - damage;

            if (battleHealth < 0) {
                battleHealth = 0;
            }
            defender.setBattleHealth(battleHealth);
            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage");

            // print defending character's health and attacking character's health
            System.out.println(defender.getName() + "'s Health: " + defender.getBattleHealth());
            System.out.println(attacker.getName() + "'s Health: " + attacker.getBattleHealth());
            if (defender.getBattleHealth() == 0) {
                System.out.println(defender.getName() + " died!");
                armies.get(defendPlayer).remove(defender);
            }
        }
        

        String homeground = players.get(1).getHomeground();
        if (homeground == "Hillcrest" && attacker.getCategory() == "Highlanders") {
            attack(attackPlayer, defendPlayer, 0.2);
        }

    }

    public void attack(int attackPlayer, int defendPlayer) {
        attack(attackPlayer, defendPlayer, 1);
    }
    public Character getFastest(ArrayList<Character> army) {
        Character fastest = army.get(0);
        for (Character character : army) {
            if (character.getSpeed() > fastest.getSpeed()) {
                fastest = character;
            }
            // Include Priority order here
        }
        return fastest;
    }

    public Character getLowestDefence(ArrayList<Character> army) {
        Character lowestDefence = army.get(0);
        for (Character character : army) {
            if (character.getDefence() < lowestDefence.getDefence()) {
                lowestDefence = character;
            }
        }
        return lowestDefence;
    }

    public Character getLowestHealth(ArrayList<Character> army) {
        Character lowestHealth = army.get(0);
        for (Character character : army) {
            if (character.getBattleHealth() < lowestHealth.getBattleHealth()) {
                lowestHealth = character;
            }
        }
        return lowestHealth;
    }

    public void setHomelandStats() {
        String homeground = players.get(1).getHomeground();
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
                                character.setBattleHealth((int) (character.getBattleHealth() * 1.1));
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

    public void endBattle(int winner, int loser) {
        System.out.println(players.get(winner).getName() + " won!");

        players.get(winner).addXP();
        resetAllBattleStats();
    }
}