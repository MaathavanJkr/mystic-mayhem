public class Equipment {
    String name;
    int price;
    int attack;
    int defence;
    int health;
    int speed;

    Equipment(String name, int price, int attack, int defence, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
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
}


//**********************************************************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************
//HAVE TO CHANGE THE VALUES OF THE EQUIPMENT
//**********************************************************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************
//**********************************************************************************************************************

class Armour extends Equipment {
    Armour(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Chainmail extends Armour {
    Chainmail() {
        super("Chainmail", 70, 0, 1, 0, -1);
    }
}

class Regalia extends Armour {
    Regalia() {
        super("Regalia", 105, 0, 1, 0, 0);
    }
}

class Fleece extends Armour {
    Fleece() {
        super("Fleece", 150, 0, 2, 1, -1);
    }
}

class Artefact extends Equipment {
    Artefact(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Excaliber extends Artefact {
    Excaliber() {
        super("Excaliber", 150, 2, 0, 0, 0);
    }
}

class Amulet extends Artefact {
    Amulet() {
        super("Amulet", 200, 1, -1, 1, 1);
    }
}

class Crystal extends Artefact {
    Crystal() {
        super("Crystal", 210, 2, 1, -1, -1);
    }
}