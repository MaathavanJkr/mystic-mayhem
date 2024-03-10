public abstract class Character {

    String name;
    int price;

    int attack;
    int defence;
    int health;
    int speed;

    int battleAttack;
    int battleDefence;
    int battleHealth;
    int battleSpeed;

    String category;

    Armour armour;
    Artefact artefact;

    Character(String name, int price, int attack, int defence, int health, int speed, String category) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;

        this.battleAttack = attack;
        this.battleDefence = defence;
        this.battleHealth = health;
        this.battleSpeed = speed;

        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int changePrice(int change) {return this.price+=change;}

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    public int getHealth() {
        return this.health;
    }

    public int getBattleAttack() {
        return this.battleAttack;
    }

    public void setBattleAttack(int battleAttack) {
        this.battleAttack = battleAttack;
    }

    public int getBattleDefence() {
        return this.battleDefence;
    }

    public void setBattleDefence(int battleDefence) {
        this.battleDefence = battleDefence;
    }

    public int getBattleHealth() {
        return this.battleHealth;
    }

    public void setBattleHealth(int battleHealth) {
        this.battleHealth = battleHealth;
    }

    public int getBattleSpeed() {
        return this.battleSpeed;
    }

    public void setBattleSpeed(int battleSpeed) {
        this.battleSpeed = battleSpeed;
    }
    
    
    public void resetBattleStats() {
        this.battleAttack = this.attack;
        this.battleDefence = this.defence;
        this.battleHealth = this.health;
        this.battleSpeed = this.speed;
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
        if (this.armour == null) {
            return;
        }
        this.defence -= this.armour.defence;
        this.health -= this.armour.health;
        this.speed -= this.armour.speed;

        // this.price -= this.armour.price * 0.2;
        this.armour = null;
    }

    public Artefact getArtefact() {
        return this.artefact;
    }

    public void setArtefact(Artefact artefact) {
        removeArtefact();
        this.artefact = artefact;
        this.attack += artefact.attack;
        this.defence += artefact.defence;
        this.health += artefact.health;
        this.speed += artefact.speed;

        this.price += artefact.price * 0.2;
    }

    public void removeArtefact() {
        if (artefact == null) {
            return;
        }
        this.attack -= this.artefact.attack;
        this.defence -= this.artefact.defence;
        this.health -= this.artefact.health;
        this.speed -= this.artefact.speed;

        this.price -= this.artefact.price * 0.2;
        this.artefact = null;
    }

    public String getCharacterInfo() {
        String outputString = this.name;

        if (this.armour != null) {
            outputString += " + " + this.armour.name;
        }

        if (this.artefact != null) {
            outputString += " + " + this.artefact.name;
        }
        return outputString;
    }
}
