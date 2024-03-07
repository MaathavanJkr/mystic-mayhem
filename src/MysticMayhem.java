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
            System.out.println("4. Exit");
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
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
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

    private static boolean isUsernameUnique(String username) {
        for (Player player : players) {
            if (player.getUsername().equals(username)) {
                System.out.println("Username already exists. Please try again.");
                return false;
            }
        }
        return true;
    }
}