import java.util.ArrayList;
import java.util.Scanner;

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
    private MythicalCreature mythicalCreature;

    private static Scanner scanner = new Scanner(System.in);

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

    public void createArmy(Archer archer, Knight knight, Mage mage, Healer healer, MythicalCreature mythicalCreature) {
        this.archer = archer;
        this.knight = knight;
        this.mage = mage;
        this.healer = healer;
        this.mythicalCreature = mythicalCreature;
    }

    public void setHomeground(Homeground homeground) {
        this.homeground = homeground;
    }
}
