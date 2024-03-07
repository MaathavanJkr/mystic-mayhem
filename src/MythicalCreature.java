public class MythicalCreature extends Character {
    MythicalCreature(String name, int price, int attack, int defence, int health, int speed, String category) {
        super(name, price, attack, defence, health, speed, category);
    }
}

class Dragon extends MythicalCreature {
    Dragon() {
        super("Dragon", 120, 12, 14, 15, 8, "Sunchildren");
    }
}

class Basilisk extends MythicalCreature {
    Basilisk() {
        super("Basilisk", 165, 15, 11, 10, 12, "Marshlanders");
    }
}

class Hydra extends MythicalCreature {
    Hydra() {
        super("Hydra", 205, 12, 16, 15, 11, "Marshlanders");
    }
}

class Phoenix extends MythicalCreature {
    Phoenix() {
        super("Phoenix", 275, 17, 13, 17, 19, "Sunchildren");
    }
}

class Pegasus extends MythicalCreature {
    Pegasus() {
        super("Pegasus", 340, 14, 18, 20, 20, "Mystics");
    }
}
