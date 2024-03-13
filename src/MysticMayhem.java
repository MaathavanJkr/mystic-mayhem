import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class MysticMayhem {
    private static int playerCount = 0;
    protected static ArrayList<Player> players = new ArrayList<>();
    private static Player currentPlayer;

    private static Scanner scanner = new Scanner(System.in);

    public static void drawMytic() {
        System.out.println("#     #   #     #      ######     #########    ########       ########     ");
        System.out.println("##   ##    #   #      #      *        #           #          #       #     ");
        System.out.println("# # # #     # #        ######         #           #          #             ");
        System.out.println("#  #  #      #                #       #           #          #             ");
        System.out.println("#     #      #         *      #       #           #          #       #     ");
        System.out.println("#     #      #          #####         #        ########       ########     ");
        System.out.println();
    }

    public static void drawMayhem() {
        System.out.println("             #     #       #        #     #     #       #    ########     #     #       ");
        System.out.println("             ##   ##      # #        #   #      #       #    #            ##   ##       ");
        System.out.println("             # # # #     #   #        # #       #########    #            # # # #       ");
        System.out.println("             #  #  #    #######        #        #       #    ########     #  #  #       ");
        System.out.println("             #     #    #     #        #        #       #    #            #     #       ");
        System.out.println("             #     #    #     #        #        #       #    ########     #     #       ");
        System.out.println();
    }

    public static void Introstring(String words) {
        System.out.println();
        System.out.println("                      -+-+-+-+-+-+-+-+-+ " + words + " !!!!!!" + "-+-+-+-+-+-+-+-+-+");
        System.out.println();
    }

    public static void space() {
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.printf("-");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Code Crashed");
            }
        }

        try {
            System.out.println("\n");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Code Crashed");
        }
        System.out.flush();

    }

    // public static void ArcherTable() {
    // System.out.printf("+----=+-------------+---------------+-----------+-------------+-----------+---------+\n");
    // System.out.printf("+-----| Archers | Gold Coins | Attack | Defense | Health |
    // Speed |\n");
    // System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
    // // Table data
    // System.out.printf("| 1 |Shooter | %11d | %7d | %8d | %7d | %5d |\n", 10, 20,
    // 30, 40, 50);
    // System.out.printf("| 2 |Ranger | %11d | %7d | %8d | %7d | %5d |\n", 15, 25,
    // 35, 45, 55);
    // System.out.printf("| 3 |Sunfire | %11d | %7d | %8d | %7d | %5d |\n", 20, 30,
    // 40, 50, 60);
    // System.out.printf("| 4 |Zing | %11d | %7d | %8d | %7d | %5d |\n", 20, 30, 40,
    // 50, 60);
    // System.out.printf("| 5 |Saggitarius | %11d | %7d | %8d | %7d | %5d |\n", 20,
    // 30, 40, 50, 60);
    // System.out.printf("+--------------+---------------+-----------+-------------+-----------+---------+\n");
    // }

    public static void ArcherTable() {
        String[] archers = { "Shooter", "Ranger", "Sunfire", "Zing", "Saggitarius" };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] goldCoins = { 80, 115, 160, 200, 230 };
        int[] attack = { 11, 14, 15, 16, 18 };
        int[] defense = { 4, 5, 5, 9, 7 };
        int[] health = { 6, 8, 7, 11, 12 };
        int[] speed = { 9, 10, 14, 14, 17 };
        Introstring("SELECT ARCHERS");
        System.out.printf("+----=+--------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf("+-----| Archers      |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-12s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void KnightTable() {
        String[] archers = { "Squire", "Cavalier", "Templar", "Zoro", "Swiftblade" };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] goldCoins = { 85, 110, 155, 180, 250 };
        int[] attack = { 8, 10, 14, 17, 18 };
        int[] defense = { 9, 12, 16, 16, 20 };
        int[] health = { 7, 7, 12, 13, 17 };
        int[] speed = { 8, 10, 12, 14, 13 };
        Introstring("SELECT KNIGHTS");
        System.out.printf("+----=+--------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf("+-----| Knights      |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-12s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void HealersTable() {
        String[] archers = { "Soother", "Medic", "Alchemis", "Saint", "Lightbringer" };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] goldCoins = { 95, 125, 150, 200, 260 };
        int[] attack = { 10, 12, 13, 16, 17 };
        int[] defense = { 8, 9, 13, 14, 15 };
        int[] health = { 9, 10, 13, 14, 15 };
        int[] speed = { 6, 7, 13, 9, 12 };
        Introstring("SELECT HEALERS");
        System.out.printf("+----=+--------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf("+-----| Healers      |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-12s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void MageTable() {
        String[] archers = { "Warlock", "Illusionist", "Enchanter", "Conjurer", "Eldritch" };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] goldCoins = { 100, 120, 160, 195, 270 };
        int[] attack = { 12, 13, 16, 18, 19 };
        int[] defense = { 7, 8, 10, 15, 17 };
        int[] health = { 10, 12, 13, 14, 18 };
        int[] speed = { 12, 14, 16, 12, 14 };
        Introstring("SELECT MAGES");
        System.out.printf("+----=+--------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf("+-----| Mages        |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-12s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void MythicalCreatureTable() {
        String[] archers = { "Dragon", "Basilisk", "Hydra", "Phoenix", "Pegasus" };
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] goldCoins = { 120, 165, 205, 275, 340 };
        int[] attack = { 12, 15, 12, 17, 14 };
        int[] defense = { 14, 11, 16, 17, 14 };
        int[] health = { 15, 10, 15, 17, 20 };
        int[] speed = { 8, 12, 11, 19, 20 };
        Introstring("SELECT MYTHICAL CREATURES");
        System.out.printf(
                "+-----+--------------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf(
                "+-----| MythicalCreature   |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf(
                "+-----+--------------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-16s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out.printf(
                "+-----+--------------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void ArmourTable() {
        String[] archers = { "Chainmail", "Regalia", "Fleece" };
        int[] numbers = { 1, 2, 3 };
        int[] goldCoins = { 70, 105, 150 };
        String[] attack = { "No Change", "No Change", "No Change" };
        String[] defense = { "+1", "+1", "+2" };
        String[] health = { "No Change", "No Change", "No Change" };
        String[] speed = { "-1", "No Change", "-1" };
        Introstring("SELECT ARMOUR");
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out
                .printf("+-----| Armour           |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-16s  | %12d  | %-7s | %-8s   | %-7s | %-2s |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void ArtefactsTable() {
        String[] archers = { "Excalibur", "Amulet", "Crystal" };
        int[] numbers = { 1, 2, 3 };
        int[] goldCoins = { 150, 200, 210 };
        String[] attack = { "+2", "+1", "+2" };
        String[] defense = { "No Change", "-1", "+1" };
        String[] health = { "No Change", "+1", "-1" };
        String[] speed = { "No Change", "+1", "-1" };
        Introstring("SELECT ARTEFACT");
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out
                .printf("+-----| Artefact         |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < archers.length; i++) {
            System.out.printf("| %2d  |%-16s  | %12s  | %7s   | %8s    | %7s   | %5s   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static Character chooseCharacter(ArrayList<Character> characters) {
        String characterType = characters.get(0).getType();
        Introstring("SELECT " + characterType);
        System.out.printf("+----=+--------------+---------------+-----------+-------------+-----------+---------+\n");
        System.out.printf("+-----| Archers      |  Gold Coins   | Attack    | Defense     | Health    | Speed   |\n");
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);
            System.out.printf("| %2d  |%-12s  | %12d  | %7d   | %8d    | %7d   | %5d   |\n",
                    i + 1,
                    character.getName(),
                    character.getPrice(),
                    (int) character.getAttack(), // Assuming getAttack() returns a double, cast to int
                    (int) character.getDefence(), // Assuming getDefence() returns a double, cast to int
                    (int) character.getHealth(), // Assuming getHealth() returns a double, cast to int
                    (int) character.getSpeed() // Assuming getSpeed() returns a double, cast to int
            );
        }
        System.out.printf("+-----+--------------+---------------+-----------+-------------+-----------+---------+\n");

        System.out.printf("Choose an " + characterType + ":");

        int choice = getChoice(characters.size());

        return characters.get(choice - 1);
    }

    public void startGame() throws InterruptedException {
        System.out.println("Welcome to Mystic Mayhem Game!");
        System.out.println();
        System.out.println();

        addDemoData();

        drawMytic();
        drawMayhem();

        while (true) {
            System.out.println("\n");
            System.out.println("\nMain Menu:");
            // System.out.println("\n-----------------
            // ----------------------------------------");
            // System.out.println();
            space();
            System.out.println("1. Create Player");
            System.out.println("2. Select Player");
            System.out.println("3. Battle Basic with White Wolf\n");
            System.out.print("Choose an option(1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            space();

            switch (choice) {
                case 1:
                    createPlayer();
                    break;
                case 2:
                    selectPlayer();
                    break;
                case 3:
                    battleBasicWithWhitewolf();
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
        Introstring("PLAYER CREATED SUCCESSFULLY");
        // choose homeground
        System.out.println();
        System.out.println("1. Hillcrest\n2. Marshland\n3. Desert\n4. Arcane");
        System.out.println();
        System.out.printf("Choose a Homeground(1/2/3/4):");
        int homegroundChoice = getChoice(4);
        switch (homegroundChoice) {
            case 1:
                player.setHomeground(new Hillcrest());
                break;
            case 2:
                player.setHomeground(new Marshland());
                break;
            case 3:
                player.setHomeground(new Desert());
                break;
            case 4:
                player.setHomeground(new Arcane());
                break;
        }

        space();

        while (true) {

            // Choose an Archer, diplay archers with their price
            System.out.println();

            ArrayList<Character> archers = new ArrayList<Character>(
                    Arrays.asList(new Shooter(), new Ranger(), new Sunfire(), new Zing(), new Saggitarius()));

            Archer archer = (Archer) chooseCharacter(archers);

            space();

            // Choose a Knight
            System.out.println();

            ArrayList<Character> knights = new ArrayList<Character>(
                    Arrays.asList(new Squire(), new Cavalier(), new Templar(), new Zoro(), new Swiftblade()));

            Knight knight = (Knight) chooseCharacter(knights);

            space();

            // Choose a Mage 
            System.out.println();

            ArrayList<Character> mages = new ArrayList<Character>(
                    Arrays.asList(new Warlock(), new Illusionist(), new Enchanter(), new Conjurer(), new Eldritch()));

            Mage mage = (Mage) chooseCharacter(mages);

            space();

            // Choose a Healer
            System.out.println();
            
            ArrayList<Character> healers = new ArrayList<Character>(
                    Arrays.asList(new Soother(), new Medic(), new Alchemist(), new Saint(), new Lightbringer()));

            Healer healer = (Healer) chooseCharacter(healers);

            space();

            // Choose a Mythical Creature
            System.out.println();
            
            ArrayList<Character> creatures = new ArrayList<Character>(
                    Arrays.asList(new Dragon(), new Basilisk(), new Hydra(), new Phoenix(), new Pegasus()));

            MythicalCreature creature = (MythicalCreature) chooseCharacter(creatures);
            
            space();

            if (archer.price + knight.price + mage.price + healer.price + creature.price <= 500) {
                player.createArmy(archer, knight, mage, healer, creature);
                break;
            } else {
                System.out.println("Total price exceeds 500 gold. Please choose again.");
            }
        }
    }

    private static void selectPlayer() throws InterruptedException {
        System.out.println("\n");
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i).getUsername());
            Thread.sleep(500);
        }
        System.out.println();
        System.out.print("Choose a player: ");
        int choice = scanner.nextInt();
        currentPlayer = players.get(choice - 1);
        System.out.println("Player selected: " + currentPlayer.getUsername());

        space();
        Introstring("SELECTED PLAYER INFO");
        currentPlayer.displayInfo();
        space();

        while (true) {
            Introstring("PLAYER OPTIONS");
            System.out.println("1. Shop\n2. Search Opponent\n3. Current Player Info\n4. Exit to Main Menu");
            System.out.println();
            System.out.printf("Choose options: ");
            int option = getChoice(4);
            switch (option) {
                case 1:

                    while (true) {
                        space();
                        Introstring("WELCOME TO SHOP");
                        System.out.println("1. Buy Character\n2. Buy Equipments\n3. Exit to Main Menu");
                        System.out.println();
                        System.out.printf("Choose options: ");
                        int shop_option = getChoice(3);
                        switch (shop_option) {
                            case 1:
                                space();
                                ShopCharacter();
                                break;
                            case 2:
                                space();
                                ShopEquipment();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid Choice\n");
                                break;
                        }
                        if (shop_option == 3) {
                            break;
                        }
                    }

                case 2:
                    searchOpponent();
                    break;

                case 3:
                    currentPlayerInfo();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Choice\n");
                    break;

            }

            if (option == 4) {
                break;
            }

        }

    }

    private static void searchOpponent() throws InterruptedException {
        if (currentPlayer == null) {
            System.out.println("No player selected.\n");
            return;
        }
        System.out.println("Current Player: " + currentPlayer.getName() + "\n");
        ArrayList<Player> opponents = players;
        opponents.remove(currentPlayer);
        Collections.shuffle(opponents);

        System.out.println("Searching for opponent...\n");

        if (opponents.size() <= 0) {
            System.out.println("No opponent found.\n");
            return;
        }

        for (Player opponent : opponents) {
            opponent.displayInfo();
            // choose to battle or skip
            System.out.println("Do you want to battle with " + opponent.getUsername() + "?\n1. Yes\n2. No");
            int choice = getChoice(2);
            if (choice == 1) {
                // battle
                Battle battle = new Battle(currentPlayer, opponent);
                battle.start();
                break;
            } else {
                System.out.println("Skipping " + opponent.getUsername() + "...");
            }
        }

    }

    public static void ShopCharacter() {
        Shop shop1 = new Shop();
        Introstring("BUY CHARACTERS");
        while (true) {
            System.out.println("1. Archer\n2. Knight\n3. Mages\n4. Healers\n5.Mythical Creatures\n6.Exit to Shop");
            System.out.println();
            System.out.printf("Choose option:");
            int characterchoice = getChoice(6);
            Character buycharacter = null;
            switch (characterchoice) {
                case 1:
                    ArcherTable();
                    System.out.println();
                    System.out.printf("Choose an archer:");
                    int archerchoice = getChoice(5);
                    switch (archerchoice) {
                        case 1:
                            buycharacter = new Shooter();
                            break;
                        case 2:
                            buycharacter = new Ranger();
                            break;
                        case 3:
                            buycharacter = new Sunfire();
                            break;
                        case 4:
                            buycharacter = new Zing();
                            break;
                        case 5:
                            buycharacter = new Saggitarius();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    space();
                    break;

                case 2:

                    KnightTable();
                    System.out.println();
                    System.out.printf("Choose a Knight:");
                    int knightchoice = getChoice(5);
                    switch (knightchoice) {
                        case 2:
                            buycharacter = new Cavalier();
                            break;
                        case 1:
                            buycharacter = new Squire();
                            break;
                        case 5:
                            buycharacter = new Swiftblade();
                            break;
                        case 3:
                            buycharacter = new Templar();
                            break;
                        case 4:
                            buycharacter = new Zoro();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    space();
                    break;

                case 3:

                    MageTable();
                    System.out.println();
                    System.out.printf("Choose a Mage:");
                    int magechoice = getChoice(5);
                    switch (magechoice) {
                        case 4:
                            buycharacter = new Conjurer();
                            break;
                        case 5:
                            buycharacter = new Eldritch();
                            break;
                        case 3:
                            buycharacter = new Enchanter();
                            break;
                        case 2:
                            buycharacter = new Illusionist();
                            break;
                        case 1:
                            buycharacter = new Warlock();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    space();
                    break;

                case 4:

                    HealersTable();
                    System.out.println();
                    System.out.printf("Choose a Healers:");
                    int healerchoice = getChoice(5);
                    switch (healerchoice) {
                        case 1:
                            buycharacter = new Soother();
                            break;
                        case 2:
                            buycharacter = new Medic();
                            break;
                        case 3:
                            buycharacter = new Alchemist();
                            break;
                        case 4:
                            buycharacter = new Saint();
                            break;
                        case 5:
                            buycharacter = new Lightbringer();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    space();
                    break;

                case 5:

                    MythicalCreatureTable();
                    System.out.println();
                    System.out.printf("Choose a Mythical Creature:");
                    int mystcreaturechoice = getChoice(5);
                    switch (mystcreaturechoice) {
                        case 1:
                            buycharacter = new Dragon();
                            break;
                        case 2:
                            buycharacter = new Basilisk();
                            break;
                        case 3:
                            buycharacter = new Hydra();
                            break;
                        case 4:
                            buycharacter = new Phoenix();
                            break;
                        case 5:
                            buycharacter = new Phoenix();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    space();
                    break;
                case 6:
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            shop1.buyNewCharacter(currentPlayer, buycharacter);
            if (characterchoice == 6) {
                break;
            }
        }

    }
    // public static void ShopEquipment() {
    // Shop shop1 = new Shop();
    // System.out.println("Buy Character:\n1. Armour\n2. Artefact");
    // int characterchoice = getChoice(2);
    // Character buycharacter = null;
    // switch (characterchoice) {
    // case 1:
    // System.out.println("Choose an archer:\n1. Shooter\n2. Ranger\n3. Sunfire\n4.
    // Zing\n5. Sagittarius");
    // int archerchoice = getChoice(playerCount);
    // switch (archerchoice) {
    // case 1:
    // buycharacter = new Shooter();
    // break;
    // case 2:
    // buycharacter = new Ranger();
    // break;
    // case 3:
    // buycharacter = new Sunfire();
    // break;
    // case 4:
    // buycharacter = new Zing();
    // break;
    // case 5:
    // buycharacter = new Saggitarius();
    // break;
    // default:
    // System.out.println("Invalid choice.");
    // break;
    // }

    // case 2:

    // System.out.println("Choose a knight:\n1. Cavalier\n2. Squire\n3.
    // Swiftblade\n4. Templar\n5. Zoro");
    // int knightchoice = getChoice(playerCount);
    // switch (knightchoice) {
    // case 1:
    // buycharacter = new Cavalier();
    // break;
    // case 2:
    // buycharacter = new Squire();
    // break;
    // case 3:
    // buycharacter = new Swiftblade();
    // break;
    // case 4:
    // buycharacter = new Templar();
    // break;
    // case 5:
    // buycharacter = new Zoro();
    // break;
    // default:
    // System.out.println("Invalid choice.");
    // break;
    // }

    // case 3:

    // System.out
    // .println("Choose a mage:\n1. Conjurer\n2. Eldritch\n3. Enchanter\n4.
    // Illusionist\n5. Warlock");
    // int magechoice = getChoice(playerCount);
    // switch (magechoice) {
    // case 1:
    // buycharacter = new Conjurer();
    // break;
    // case 2:
    // buycharacter = new Eldritch();
    // break;
    // case 3:
    // buycharacter = new Enchanter();
    // break;
    // case 4:
    // buycharacter = new Illusionist();
    // break;
    // case 5:
    // buycharacter = new Warlock();
    // break;
    // default:
    // System.out.println("Invalid choice.");
    // break;
    // }

    // case 4:

    // System.out.println("Choose a healer:\n1. Alchemist\n2. Lightbringer\n3.
    // Medic\n4. Saint\n5. Soother");
    // int healerchoice = getChoice(playerCount);
    // switch (healerchoice) {
    // case 1:
    // buycharacter = new Conjurer();
    // break;
    // case 2:
    // buycharacter = new Eldritch();
    // break;
    // case 3:
    // buycharacter = new Enchanter();
    // break;
    // case 4:
    // buycharacter = new Illusionist();
    // break;
    // case 5:
    // buycharacter = new Warlock();
    // break;
    // default:
    // System.out.println("Invalid choice.");
    // break;
    // }

    // case 5:

    // System.out.println(
    // "Choose a mythical creature:\n1. Basilisk\n2. Dragon\n3. Hydra\n4.
    // Pegasus\n5. Phoenix");
    // int mystcreaturechoice = getChoice(playerCount);
    // switch (mystcreaturechoice) {
    // case 1:
    // buycharacter = new Conjurer();
    // break;
    // case 2:
    // buycharacter = new Eldritch();
    // break;
    // case 3:
    // buycharacter = new Enchanter();
    // break;
    // case 4:
    // buycharacter = new Illusionist();
    // break;
    // case 5:
    // buycharacter = new Warlock();
    // break;
    // default:
    // System.out.println("Invalid choice.");
    // break;
    // }

    // System.out.println("Invalid choice.");

    // }
    // shop1.buyNewCharacter(currentPlayer, buycharacter);

    // }
    private static void ShopEquipment() {
        while (true) {
            Shop shop2 = new Shop();
            if (currentPlayer == null) {
                System.out.println("No player selected.");
                return;
            }
            System.out.println("Gold left: " + currentPlayer.getGold());
            System.out.println("\n1. Archer\n2. Knight\n3. Mage\n4. Healer\n5. Mythical Creature\n6.Exit to Shop");
            System.out.printf("\nChoose option:");
            int choice = getChoice(6);
            Character character = null;
            switch (choice) {
                case 1:
                    System.out.println("You chose Archer.");
                    character = currentPlayer.getArcher();
                    break;
                case 2:
                    System.out.println("You chose Knight.");
                    character = currentPlayer.getKnight();
                    break;
                case 3:
                    System.out.println("You chose Mage.");
                    character = currentPlayer.getMage();
                    break;
                case 4:
                    System.out.println("You chose Healer.");
                    character = currentPlayer.getHealer();
                    break;
                case 5:
                    System.out.println("You chose Mythical Creature.");
                    character = currentPlayer.getMythicalCreature();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            if (choice == 6) {
                break;
            }
            // choose armour to buy from chainmail regalia, fleece
            ArmourTable();
            System.out.println();
            System.out.printf("Choose an Armour to buy:");
            int armourChoice = getChoice(4);
            Armour armour = null;
            switch (armourChoice) {
                case 1:
                    System.out.println("You chose Chainmail.");
                    armour = new Chainmail();
                    break;
                case 2:
                    System.out.println("You chose Regalia.");
                    armour = new Regalia();
                    break;
                case 3:
                    System.out.println("You chose Fleece.");
                    armour = new Fleece();
                    break;
                case 4:
                    System.out.println("You chose to skip buying armour.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            if (armour != null) {
                // if (currentPlayer.getGold() >= armour.price) {
                // character.setArmour(armour);
                // currentPlayer.setGold(currentPlayer.getGold() - armour.price);
                // System.out.println("Bought " + armour.name + " for " + armour.price + "
                // gold.");
                // } else {
                // System.out.println("Not enough gold to buy " + armour.name + ".");
                // return;
                // }
                shop2.buyArmour(currentPlayer, character, armour);
            }

            // choose artefact to buy from excaliber, amulet and crystal
            ArtefactsTable();
            System.out.println();
            System.out.printf("Choose an Artefact to buy:");
            int artefactChoice = getChoice(4);
            Artefact artefact = null;
            switch (artefactChoice) {
                case 1:
                    System.out.println("You chose Excaliber.");
                    artefact = new Excaliber();
                    break;
                case 2:
                    System.out.println("You chose Amulet.");
                    artefact = new Amulet();
                    break;
                case 3:
                    System.out.println("You chose Crystal.");
                    artefact = new Crystal();
                    break;
                case 4:
                    System.out.println("You chose to skip buying artefact.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            if (artefact != null) {
                if (currentPlayer.getGold() >= artefact.price) {
                    character.setArtefact(artefact);
                    currentPlayer.setGold(currentPlayer.getGold() - artefact.price);
                    System.out.println("Bought " + artefact.name + " for " + artefact.price + " gold.");
                } else {
                    System.out.println("Not enough gold to buy " + artefact.name + ".");
                    return;
                }
            }

        }

    }

    private static void currentPlayerInfo() throws InterruptedException {
        if (currentPlayer == null) {
            System.out.println("No player selected.");
            return;
        }

        Object[] info = {
                "\nCurrent Player: " + currentPlayer.getName(),
                "Gold: " + currentPlayer.getGold(),
                "XP: " + currentPlayer.getXP(),
                "Archer: " + currentPlayer.getArcher().getCharacterInfo(),
                "Knight: " + currentPlayer.getKnight().getCharacterInfo(),
                "Mage: " + currentPlayer.getMage().getCharacterInfo(),
                "Healer: " + currentPlayer.getHealer().getCharacterInfo(),
                "Mythical Creature: " + currentPlayer.getMythicalCreature().getCharacterInfo(),
                "Homeground: " + currentPlayer.getHomeground()
        };

        for (Object informations : info) {
            System.out.println(informations);
            Thread.sleep(500);
        }
        System.out.println("\n");
    }

    private static void battleBasicWithWhitewolf() throws InterruptedException {
        Player basicPlayer = players.get(4);
        Player whitewolf = players.get(5);
        Battle battle = new Battle(basicPlayer, whitewolf);
        battle.start();
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

    private static int getChoice(int choiceCount) {
        int choice = 0;
        while (true) {
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= choiceCount) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and" + choiceCount);
            }
        }
        return choice;
    }

    private static void addDemoData() {
        Player player1 = new Player("Umen", "umen", playerCount++);
        player1.setGold(10000);
        player1.setHomeground(new Hillcrest());
        players.add(player1);
        player1.createArmy(new Shooter(), new Cavalier(), new Conjurer(), new Alchemist(), new Basilisk());
        Player player2 = new Player("Ilampoornan", "ilam", playerCount++);
        player2.setGold(10000);
        player2.setHomeground(new Marshland());
        players.add(player2);
        player2.createArmy(new Ranger(), new Squire(), new Eldritch(), new Lightbringer(), new Dragon());
        Player player3 = new Player("Varun", "varun", playerCount++);
        player3.setGold(10000);
        player3.setHomeground(new Desert());
        players.add(player3);
        player3.createArmy(new Sunfire(), new Swiftblade(), new Enchanter(), new Medic(), new Hydra());
        Player player4 = new Player("Maathavan", "maathavan", playerCount++);
        player4.setGold(10000);
        player4.setHomeground(new Arcane());
        players.add(player4);
        player4.createArmy(new Saggitarius(), new Swiftblade(), new Eldritch(), new Lightbringer(), new Pegasus());

        Player basicPlayer = new Player("Basic", "basic", playerCount++);
        basicPlayer.setHomeground(new Hillcrest());
        players.add(basicPlayer);
        basicPlayer.createArmy(new Shooter(), new Squire(), new Warlock(), new Soother(), new Dragon());

        Player whitewolf = new Player("GeraltofRivia", "whitewolf", playerCount++);
        whitewolf.setGold(10000);
        whitewolf.setHomeground(new Marshland());
        players.add(whitewolf);
        whitewolf.createArmy(new Ranger(), new Squire(), new Warlock(), new Medic(), new Dragon());
        whitewolf.getArcher().setArmour(new Chainmail());
        whitewolf.getHealer().setArtefact(new Amulet());

        currentPlayer = player4;
    }

}