import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MysticMayhem {
    private static int playerCount = 0;
    protected static ArrayList<Player> players = new ArrayList<>();
    private static Player currentPlayer;

    private static ArrayList<Character> archers = new ArrayList<Character>(
            Arrays.asList(new Shooter(), new Ranger(), new Sunfire(), new Zing(), new Saggitarius()));

    private static ArrayList<Character> knights = new ArrayList<Character>(
            Arrays.asList(new Squire(), new Cavalier(), new Templar(), new Zoro(), new Swiftblade()));

    private static ArrayList<Character> mages = new ArrayList<Character>(
            Arrays.asList(new Warlock(), new Illusionist(), new Enchanter(), new Conjurer(), new Eldritch()));

    private static ArrayList<Character> healers = new ArrayList<Character>(
            Arrays.asList(new Soother(), new Medic(), new Alchemist(), new Saint(), new Lightbringer()));

    private static ArrayList<Character> creatures = new ArrayList<Character>(
            Arrays.asList(new Dragon(), new Basilisk(), new Hydra(), new Phoenix(), new Pegasus()));

    private static Scanner scanner = new Scanner(System.in);

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay() {
        delay(200);
    }

    public static void delay(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println("Code Crashed");
        }
    }

    public static void colorIT(String color, String word) {
        String ColorCode = color;
        String resetColorCode = "\u001B[0m";
        System.out.println(ColorCode + word + resetColorCode);
        delay();

    }

    public static void drawMytic() {

        // ANSI escape code to reset color
        colorIT("\u001B[35m", "#     #   #     #      ######     #########    ########       ########     ");
        colorIT("\u001B[35m", "##   ##    #   #      #      *        #           #          #        #    ");
        colorIT("\u001B[35m", "# # # #     # #        ######         #           #          #             ");
        colorIT("\u001B[35m", "#     #      #         *      #       #           #          #       #     ");
        colorIT("\u001B[35m", "#     #      #          #####         #        ########       ########     ");
        System.out.println();
    }

    public static void drawMayhem() {
        colorIT("\u001B[31m",
                "             #     #       #        #     #     #       #    ########     #     #       ");
        colorIT("\u001B[31m",
                "             ##   ##      # #        #   #      #       #    #            ##   ##       ");
        colorIT("\u001B[31m",
                "             # # # #     #   #        # #       #########    #            # # # #       ");
        colorIT("\u001B[31m",
                "             #  #  #    #######        #        #       #    ########     #  #  #       ");
        colorIT("\u001B[31m",
                "             #     #    #     #        #        #       #    #            #     #       ");
        colorIT("\u001B[31m",
                "             #     #    #     #        #        #       #    ########     #     #       ");
        System.out.println();
    }

    public static void drawSword() {
        colorIT("\u001B[31m", "                 #");
        colorIT("\u001B[31m", "                #   # ");
        colorIT("\u001B[31m", "                 #   #");
        colorIT("\u001B[31m", "                  #   #");
        colorIT("\u001B[31m", "                   #   #");
        colorIT("\u001B[31m", "                    #   #");
        colorIT("\u001B[31m", "                     #   #");
        colorIT("\u001B[31m", "                      #   #");
        colorIT("\u001B[31m", "                       #   #");
        colorIT("\u001B[31m", "                        #   #       #");
        colorIT("\u001B[31m", "                         #   #  #");
        colorIT("\u001B[31m", "                          ## ##");
        colorIT("\u001B[31m", "                          #  # #     ");
        colorIT("\u001B[31m", "                       #    #   #");
        colorIT("\u001B[31m", "                             #   #");
        colorIT("\u001B[31m", "                              #   #");
        colorIT("\u001B[31m", "                               #   #");
        colorIT("\u001B[31m", "                                #   #");
        colorIT("\u001B[31m", "                                 #   #");
        colorIT("\u001B[31m", "                                   ##");
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
            System.out.printf("| %2d  |%-12s  | %12s  | %7s   | %8s    | %7s   | %5s   |\n", numbers[i], archers[i],
                    goldCoins[i], attack[i], defense[i], health[i], speed[i]);
        }
        System.out
                .printf("+-----+------------------+---------------+-----------+-------------+-----------+---------+\n");

    }

    public static void MainMenu() throws InterruptedException {
        while (true) {
            space();
            System.out.println("\n");
            Introstring("MAIN MENU");
            // System.out.println("\n-----------------
            // ----------------------------------------");
            // System.out.println();
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

    public static Character chooseCharacter(ArrayList<Character> characters) {
        String characterType = characters.get(0).getType();
        Introstring("SELECT " + characterType.toUpperCase());
        System.out.printf(
                "+-----+---------------------+----------------+-----------+-------------+-----------+---------+\n");
        System.out.printf(
                "+-----| %-19s |  %-12s  | %-7s   | %-8s    | %-7s   | %-5s  |\n",
                characterType, "Gold Coins", "Attack", "Defense", "Health", "Speed");
        System.out.printf(
                "+-----+----------------------+---------------+-----------+-------------+-----------+---------+\n");
        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);
            System.out.printf("| %2d  |%-19s | %-12d  | %-7d   | %-8d    | %-7d   | %-5d   |\n",
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
        delay();
        Introstring("WELCOME TO MYSTIC MAYHEM");
        addDemoData();
        drawMytic();
        drawMayhem();
        drawSword();
        delay(1000);
        clear();
        MainMenu();
    }

    private static void createPlayer() throws InterruptedException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        while (name.length() == 0) {
            System.out.print("Enter a valid name");
            delay(1000);
            clear();
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        }
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        while (username.length() == 0) {
            System.out.print("Enter a valid username");
            delay(1000);
            clear();
            System.out.print("Enter username: ");
            username = scanner.nextLine();
        }

        while (!isUsernameUnique(username)) {
            System.out.print("Username already exist. Enter new username: ");
            username = scanner.nextLine();
        }

        Player player = new Player(name, username, playerCount++);
        players.add(player);
        Introstring("PLAYER CREATED SUCCESSFULLY");
        clear();
        // choose homeground
        System.out.println();
        Introstring("HOME GROUND");
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
            Archer archer = (Archer) chooseCharacter(archers);
            space();

            // Choose a Knight
            System.out.println();
            Knight knight = (Knight) chooseCharacter(knights);
            space();

            // Choose a Mage
            System.out.println();
            Mage mage = (Mage) chooseCharacter(mages);
            space();

            // Choose a Healer
            System.out.println();
            Healer healer = (Healer) chooseCharacter(healers);
            space();

            // Choose a Mythical Creature
            System.out.println();
            MythicalCreature creature = (MythicalCreature) chooseCharacter(creatures);
            space();

            if (archer.getPrice() + knight.getPrice() + mage.getPrice() + healer.getPrice() + creature.getPrice() <= 500) {
                player.createArmy(archer, knight, mage, healer, creature);
                space();
                Introstring("PLAYER INFO");
                currentPlayer = player;
                currentPlayer.displayInfo();
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
        System.out.println("7.Exit to Main Menu");
        System.out.println();
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();
        if (choice == 7) {
            MainMenu();
        }
        while (choice <= 0 | choice > players.size() + 1) {

            Introstring("Choose a Valid Player ");
            delay(2000);
            space();
            for (int i = 0; i < players.size(); i++) {
                System.out.println((i + 1) + ". " + players.get(i).getUsername());
                Thread.sleep(500);
            }
            System.out.println();
            System.out.print("Choose a player: ");
            choice = scanner.nextInt();
        }
        currentPlayer = players.get(choice - 1);
        System.out.println("Player selected: " + currentPlayer.getUsername());

        space();
        Introstring("SELECTED PLAYER INFO");
        currentPlayer.displayInfo();
        System.out.println();
        // space();

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
                        System.out.println("1. Buy Character\n2. Buy Equipments\n3. Exit to Player Options");
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
                    break;

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
                    buycharacter = (Archer) chooseCharacter(archers);
                    space();
                    break;
                case 2:
                    buycharacter = (Knight) chooseCharacter(knights);
                    space();
                    break;
                case 3:
                    buycharacter = (Mage) chooseCharacter(mages);
                    space();
                    break;
                case 4:
                    buycharacter = (Healer) chooseCharacter(healers);
                    space();
                    break;
                case 5:
                    buycharacter = (MythicalCreature) chooseCharacter(creatures);
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
                if (currentPlayer.getGold() >= armour.price) {
                    
                shop2.buyArmour(currentPlayer, character, armour);
                System.out.println("Bought " + armour.name + " for " + armour.price + " gold.");
                System.out.println("Remaining Gold:" + currentPlayer.getGold());
                } else {
                System.out.println("Not enough gold to buy " + armour.name + ".");
                return;
                }
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
                    shop2.buyArtefact(currentPlayer, character, artefact);
                    System.out.println("Bought " + artefact.name + " for " + artefact.price + " gold.");
                    System.out.println("Remaining Gold:" + currentPlayer.getGold());
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
                "Homeground: " + currentPlayer.getHomeground().getName()
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
        whitewolf.setGold(215);
        whitewolf.getArcher().setArmour(new Chainmail());
        whitewolf.getHealer().setArtefact(new Amulet());

        currentPlayer = player4;
    }

}