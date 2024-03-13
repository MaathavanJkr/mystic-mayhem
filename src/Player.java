import java.util.ArrayList;

class Player {

    private String name;
    private String username;
    private int userID;

    private int XP;
    private int gold;
    private Archer archer;
    private Knight knight;
    private Mage mage;
    private Healer healer;
    private MythicalCreature mythicalCreature;
    private String homeground;
    private ArrayList<Character> characters = new ArrayList<>();

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

    public int getXP() {
        return this.XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public void addXP() {
        this.XP += 1;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void changeGold(int change) {
        this.gold += change;
    }

    public Archer getArcher() {
        return this.archer;
    }

    public void setArcher(Archer archer) {
        this.archer = archer;
    }

    public Knight getKnight() {
        return this.knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public Mage getMage() {
        return this.mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }

    public Healer getHealer() {
        return this.healer;
    }

    public void setHealer(Healer healer) {
        this.healer = healer;
    }

    public MythicalCreature getMythicalCreature() {
        return this.mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public String getHomeground() {
        return this.homeground;
    }

    public void setHomeground(String homeground) {
        this.homeground = homeground;
    }

    public void buyCharacter(Character character) {
        if (this.gold >= character.getPrice()) {
            this.gold -= character.getPrice();
            addCharacter(character);
        } else {
            System.out.println("Not enough gold");
        }
    }

    public void createArmy(Archer archer, Knight knight, Mage mage, Healer healer, MythicalCreature mythicalCreature) {
        this.archer = archer;
        this.knight = knight;
        this.mage = mage;
        this.healer = healer;
        this.mythicalCreature = mythicalCreature;

        buyCharacter(archer);
        buyCharacter(knight);
        buyCharacter(mage);
        buyCharacter(healer);
        buyCharacter(mythicalCreature);
    }

    public void displayInfo() throws InterruptedException {
        Object[] info = {
                "\nName: " + this.name,
                "XP: " + this.XP,
                "Gold: " + this.getGold(),
                "Archer: " + this.archer.getName(),
                "Knight: " + this.knight.getName(),
                "Mage: " + this.mage.getName(),
                "Healer: " + this.healer.getName(),
                "Mythical Creature: " + this.mythicalCreature.getName()
        };

        for (Object informations :info){
            System.out.println(informations);
            Thread.sleep(500);
        }
        System.out.println("\n");

    }

    public ArrayList<Character> getArmy() {
        ArrayList<Character> army = new ArrayList<>();
        army.add(this.archer);
        army.add(this.knight);
        army.add(this.mage);
        army.add(this.healer);
        army.add(this.mythicalCreature);
        return army;
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }

}
