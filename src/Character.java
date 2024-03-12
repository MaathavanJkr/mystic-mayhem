public abstract class Character {

    String name;
    String type;
    int price;

    double attack;
    double defence;
    double health;
    double speed;

    double battleAttack;
    double battleDefence;
    double battleHealth;
    double battleSpeed;

    String category;

    Armour armour;
    Artefact artefact;

    Character(String type, String name, int price, int attack, int defence, int health, int speed, String category) {
        this.name = name;
        this.type = type;
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

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public int changePrice(int change) {return this.price+=change;}

    public double getAttack() {
        return this.attack;
    }

    public double getDefence() {
        return this.defence;
    }

    public double getHealth() {
        return this.health;
    }

    public double getBattleAttack() {
        return this.battleAttack;
    }

    public void setBattleAttack(double battleAttack) {
        this.battleAttack = battleAttack;
    }

    public double getBattleDefence() {
        return this.battleDefence;
    }

    public void setBattleDefence(double battleDefence) {
        this.battleDefence = battleDefence;
    }

    public double getBattleHealth() {
        return this.battleHealth;
    }

    public void setBattleHealth(double battleHealth) {
        this.battleHealth = battleHealth;
    }

    public double getBattleSpeed() {
        return this.battleSpeed;
    }

    public void setBattleSpeed(double battleSpeed) {
        this.battleSpeed = battleSpeed;
    }
    
    
    public void resetBattleStats() {
        this.battleAttack = this.attack;
        this.battleDefence = this.defence;
        this.battleHealth = this.health;
        this.battleSpeed = this.speed;
    }

    public double getSpeed() {
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

        resetBattleStats();
        this.price += armour.price * 0.2;
    }

    public void removeArmour() {
        if (this.armour == null) {
            return;
        }
        this.defence -= this.armour.defence;
        this.health -= this.armour.health;
        this.speed -= this.armour.speed;
        resetBattleStats();

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

        resetBattleStats();
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

        resetBattleStats();
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
