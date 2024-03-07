public class mythicalCreature extends Character{
    mythicalCreature(String name, int price, int attack, int defence, int health, int speed,String category) {
        super(name, price, attack, defence, health, speed,category);
    }
}

class Dragon extends mythicalCreature {
    Dragon() {
        super("Dragon", 120, 12, 14, 15, 8,"Sunchildren");
    }
}

class Basilisk extends mythicalCreature {
    Basilisk() {
        super("Basilisk", 165, 15, 11, 10, 12,"Marshlanders");
    }
}

class Hydra extends mythicalCreature {
    Hydra() {
        super("Hydra", 205, 12, 16, 15, 11,"Marshlanders");
    }
}

class Phoenix extends mythicalCreature {
    Phoenix() {
        super("Phoenix", 275, 17, 13, 17, 19,"Sunchildren");
    }
}

class Pegasus extends mythicalCreature {
    Pegasus() {
        super("Pegasus", 340, 14, 18, 20, 20,"Mystics");
    }
}

