import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDatabase {
    private static int nextID = 1;
    private static ArrayList<String> usernames;
    protected static ArrayList<Player> players;

    Scanner scanner = new Scanner(System.in);

    public void addPlayer() {
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        String username = "";
        boolean validUserName = false;
        while (!validUserName) {
            System.out.println("Enter a valid username: ");
            username = scanner.nextLine();
            if (usernames.contains(username)) {
                System.out.println("username already exists");
            } else
                validUserName = true;
        }

        Player player = new Player(name, username, nextID++);
        usernames.add(username);
        players.add(player);
        System.out.println("player successfully created");
    }
}

class Player {

    private String name;
    private String username;
    private int userID;

    private int XP;

    private int gold;

    private Homeground homeground;

    private Archer archer;

    private Knight knight;

    private Mage mage;

    private Healer healer;

    private mythicalCreature mythicalCreature;

    public Player(String name, String username, int userID) {
        this.name = name;
        this.username = username;
        this.userID = userID;
        this.gold = 500;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public int getUserID() {
        return this.userID;
    }

    public void initialGold() {
        this.gold = 500;
    }

    public void changeGold(int gold) {
        this.gold += gold;
    }

    public void afterCombat(String result) {

    }

    public void buyCharacter(Character character) {
        gold -= character.price;

    }

}
