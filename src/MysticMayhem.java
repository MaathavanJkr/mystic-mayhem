import java.util.ArrayList;
import java.util.Scanner;

public class MysticMayhem {
    private static int playerCount = 0;
    protected static ArrayList<Player> players = new ArrayList<>();
    private static Player currentPlayer;

    private static Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("Welcome to Mystic Mayhem Game!");
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Create Player");
            System.out.println("2. Select Player");
            System.out.println("3. Search for Opponent");
            System.out.println("4. Buy Equipments");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createPlayer();
                    break;
                case 2:
                    selectPlayer();
                    break;
                case 3:
                    searchOpponent();
                    break;
                case 4:
                    buyEquipments();
                    break;
                default:
                    // System.out.println("Invalid choice. Please try again.");
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    private static void createPlayer() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        while (!isUsernameUnique(username)) {
            System.out.print("Username already exist. Enter new username: ");
            username = scanner.nextLine();
        }

        Player player = new Player(name, username, playerCount++);
        players.add(player);
        System.out.println("Player created successfully!");

        while (true) {
            System.out.println("Choose an archer:\n1. Shooter\n2. Ranger\n3. Sunfire\n4. Zing\n5. Sagittarius");
            int archerChoice = getChoice();
            Archer archer = null;
            switch (archerChoice) {
                case 1:
                    System.out.println("You chose Shooter.");
                    archer = new Shooter();
                    break;
                case 2:
                    System.out.println("You chose Ranger.");
                    archer = new Ranger();
                    break;
                case 3:
                    System.out.println("You chose Sunfire.");
                    archer = new Sunfire();
                    break;
                case 4:
                    System.out.println("You chose Zing.");
                    archer = new Zing();
                    break;
                case 5:
                    System.out.println("You chose Sagittarius.");
                    archer = new Saggitarius();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    
            // Choose a Knight
            System.out.println("Choose a knight:\n1. Cavalier\n2. Squire\n3. Swiftblade\n4. Templar\n5. Zoro");
            int knightChoice = getChoice();
            Knight knight = null;
            switch (knightChoice) {
                case 1:
                    System.out.println("You chose Cavalier.");
                    knight = new Cavalier();
                    break;
                case 2:
                    System.out.println("You chose Squire.");
                    knight = new Squire();
                    break;
                case 3:
                    System.out.println("You chose Swiftblade.");
                    knight = new Swiftblade();
                    break;
                case 4:
                    System.out.println("You chose Templar.");
                    knight = new Templar();
                    break;
                case 5:
                    System.out.println("You chose Zoro.");
                    knight = new Zoro();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    
            // Choose a Mage
            System.out.println("Choose a mage:\n1. Conjurer\n2. Eldritch\n3. Enchanter\n4. Illusionist\n5. Warlock");
            int mageChoice = getChoice();
            Mage mage = null;
            switch (mageChoice) {
                case 1:
                    System.out.println("You chose Conjurer.");
                    mage = new Conjurer();
                    break;
                case 2:
                    System.out.println("You chose Eldritch.");
                    mage = new Eldritch();
                    break;
                case 3:
                    System.out.println("You chose Enchanter.");
                    mage = new Enchanter();
                    break;
                case 4:
                    System.out.println("You chose Illusionist.");
                    mage = new Illusionist();
                    break;
                case 5:
                    System.out.println("You chose Warlock.");
                    mage = new Warlock();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    
            // Choose a Healer
            System.out.println("Choose a healer:\n1. Alchemist\n2. Lightbringer\n3. Medic\n4. Saint\n5. Soother");
            int healerChoice = getChoice();
            Healer healer = null;
            switch (healerChoice) {
                case 1:
                    System.out.println("You chose Alchemist.");
                    healer = new Alchemist();
                    break;
                case 2:
                    System.out.println("You chose Lightbringer.");
                    healer = new Lightbringer();
                    break;
                case 3:
                    System.out.println("You chose Medic.");
                    healer = new Medic();
                    break;
                case 4:
                    System.out.println("You chose Saint.");
                    healer = new Saint();
                    break;
                case 5:
                    System.out.println("You chose Soother.");
                    healer = new Soother();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    
            // Choose a Mythical Creature
            System.out.println("Choose a mythical creature:\n1. Basilisk\n2. Dragon\n3. Hydra\n4. Pegasus\n5. Phoenix");
            int creatureChoice = getChoice();
            MythicalCreature creature = null;
            switch (creatureChoice) {
                case 1:
                    System.out.println("You chose Basilisk.");
                    creature = new Basilisk();
                    break;
                case 2:
                    System.out.println("You chose Dragon.");
                    creature = new Dragon();
                    break;
                case 3:
                    System.out.println("You chose Hydra.");
                    creature = new Hydra();
                    break;
                case 4:
                    System.out.println("You chose Pegasus.");
                    creature = new Pegasus();
                    break;
                case 5:
                    System.out.println("You chose Phoenix.");
                    creature = new Phoenix();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    
            if (archer.price + knight.price + mage.price + healer.price + creature.price <= 500) {
                player.createArmy(archer, knight, mage, healer, creature);
                break;
            } else {
                System.out.println("Total price exceeds 500 gold. Please choose again.");
            }
        }
    }

    private static void selectPlayer() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i).getUsername());
        }
        System.out.print("Choose a player: ");
        int choice = scanner.nextInt();
        currentPlayer = players.get(choice - 1);
        System.out.println("Player selected: " + currentPlayer.getUsername());
    }

    private static void searchOpponent() {
        System.out.println("Current Player: " + currentPlayer.getName());
        System.out.println("Searching for opponent...");
    }

    private static void buyEquipments() {
        System.out.println("Choose a character to buy artifacts for:\n1. Archer\n2. Knight\n3. Mage\n4. Healer\n5. Mythical Creature");
        int choice = getChoice();
        Character character = null;
        switch (choice) {
            case 1:
                System.out.println("You chose Archer.");
                break;
            case 2:
                System.out.println("You chose Knight.");
                break;
            case 3:
                System.out.println("You chose Mage.");
                break;
            case 4:
                System.out.println("You chose Healer.");
                break;
            case 5:
                System.out.println("You chose Mythical Creature.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static boolean isUsernameUnique(String username) {
        for (Player player : players) {
            if (player.getUsername().equals(username)) {
                System.out.println("Username already exists. Please try again.");
                return false;
            }
        }
        return true;
    }

    private static int getChoice() {
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }
}