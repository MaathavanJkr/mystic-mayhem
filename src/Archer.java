public class Archer extends Character {
    Archer(String name, int price, int attack, int defence, int health, int speed, String category) {
        super(name, price, attack, defence, health, speed, category);
    }
}

class Shooter extends Archer {
    Shooter() {
        super("Shooter", 80, 11, 4, 6, 9, "Highlanders");
    }
}

class Ranger extends Archer {
    Ranger() {
        super("Ranger", 115, 14, 5, 8, 10, "Highlanders");
    }
}

class Sunfire extends Archer {
    Sunfire() {
        super("Sunfire", 160, 15, 5, 7, 14, "Sunchildren");
    }
}

class Zing extends Archer {
    Zing() {
        super("Zing", 200, 16, 9, 11, 14, "Sunchildren");
    }
}

class Saggitarius extends Archer {
    Saggitarius() {
        super("Saggitarius", 230, 18, 7, 12, 17, "Mystics");
    }
}
