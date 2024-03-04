public class Archer extends Character{
    Archer(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Shooter extends Archer {
    Shooter() {
        super("Shooter", 80, 11, 4, 6, 9);
    }
}

class Ranger extends Archer {
    Ranger() {
        super("Ranger", 115, 14, 5, 8, 10);
    }
}

class Sunfire extends Archer {
    Sunfire() {
        super("Sunfire", 160, 15, 5, 7, 14);
    }
}

class Zing extends Archer {
    Zing() {
        super("Zing", 200, 16, 9, 11, 14);
    }
}

class Saggitarius extends Archer {
    Saggitarius() {
        super("Saggitarius", 230, 18, 7, 12, 17);
    }
}

