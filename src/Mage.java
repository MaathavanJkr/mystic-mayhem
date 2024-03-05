public class Mage extends Character{
    Mage(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Warlock extends Mage {
    Warlock() {
        super("Warlock", 100, 12, 7, 10, 12);
    }
}

class Illusionist extends Mage {
    Illusionist() {
        super("Illusionist", 120, 13, 8, 12, 14);
    }
}

class Enchanter extends Mage {
    Enchanter() {
        super("Enchanter", 160, 16, 10, 13, 16);
    }
}

class Conjurer extends Mage {
    Conjurer() {
        super("Conjurer", 195, 18, 15, 14, 12);
    }
}

class Eldritch extends Mage {
    Eldritch() {
        super("Eldritch", 270, 19, 17, 18, 14);
    }
}

