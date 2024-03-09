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
}

class Armour extends Equipment {
    Armour(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Chainmail extends Armour {
    Chainmail() {
        super("Chainmail", 100, 0, 5, 10, 0);
    }
}

class Regalia extends Armour {
    Regalia() {
        super("Regalia", 200, 0, 10, 20, 0);
    }
}

class Fleece extends Armour {
    Fleece() {
        super("Fleece", 300, 0, 15, 30, 0);
    }
}

class Artefact extends Equipment {
    Artefact(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Excaliber extends Artefact {
    Excaliber() {
        super("Excaliber", 500, 20, 0, 0, 0);
    }
}

class Amulet extends Artefact {
    Amulet() {
        super("Amulet", 300, 0, 0, 0, 10);
    }
}

class Crystal extends Artefact {
    Crystal() {
        super("Crystal", 400, 0, 0, 0, 20);
    }
}