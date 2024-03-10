public abstract class Character {

    String name;
    int price;
    int attack;
    int defence;
    int health;
    int battleHealth;
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
        this.battleHealth = health;
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

    public int getBattleHealth() {
        return this.battleHealth;
    }

    public void setBattleHealth(int battleHealth) {
        this.battleHealth = battleHealth;
    }

    public void resetBattleHealth() {
        this.battleHealth = this.health;
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
        removeArmour();
        this.armour = armour;
        this.defence += armour.defence;
        this.health += armour.health;
        this.speed += armour.speed;

        this.price += armour.price * 0.2;
    }

    public void removeArmour() {
        this.defence -= this.armour.defence;
        this.health -= this.armour.health;
        this.speed -= this.armour.speed;

        // this.price -= this.armour.price * 0.2;
        this.armour = null;
    }

    public Artefact getArtifact() {
        return this.artifact;
    }

    public void setArtefact(Artefact artefact) {
        removeArtefact();
        this.artifact = artefact;
        this.attack += artefact.attack;
        this.defence += artefact.defence;
        this.health += artefact.health;
        this.speed += artefact.speed;

        this.price += artefact.price * 0.2;
    }

    public void removeArtefact() {
        this.attack -= this.artifact.attack;
        this.defence -= this.artifact.defence;
        this.health -= this.artifact.health;
        this.speed -= this.artifact.speed;

        // this.price -= this.artifact.price * 0.2;
        this.artifact = null;
    }

    public String getCharacterInfo() {
        String outputString = this.name;

        if (this.armour != null) {
            outputString += " + " + this.armour.name;
        }

        if (this.artifact != null) {
            outputString += " + " + this.artifact.name;
        }
        return outputString;
    }
}
