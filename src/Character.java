public abstract class Character {

    String name;
    int price;
    int attack;
    int defence;
    int health;
    int speed;
    String category;

    Armour armour;
    Artefact artifact;

    Character(String name, int price, int attack, int defence, int health, int speed, String category) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    public int getHealth() {
        return this.health;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getCategory() {
        return this.category;
    }

    public Armour getArmour() {
        return this.armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
        this.defence += armour.defence;
        this.health += armour.health;
        this.speed += armour.speed;

        this.price += armour.price * 0.2;
    }

    public Artefact getArtifact() {
        return this.artifact;
    }

    public void setArtifact(Artefact artefact) {
        this.artifact = artefact;
        this.attack += artefact.attack;
        this.defence += artefact.defence;
        this.health += artefact.health;
        this.speed += artefact.speed;

        this.price += artefact.price * 0.2;
    }
}
