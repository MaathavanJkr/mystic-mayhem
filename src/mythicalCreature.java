public class mythicalCreature extends Character{
    mythicalCreature(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class DragonCreature extends mythicalCreature {
    DragonCreature() {
        super("Dragon", 120, 12, 14, 15, 8);
    }
}

class BasiliskCreature extends mythicalCreature {
    BasiliskCreature() {
        super("Basilisk", 165, 15, 11, 10, 12);
    }
}

class HydraCreature extends mythicalCreature {
    HydraCreature() {
        super("Hydra", 205, 12, 16, 15, 11);
    }
}

class PhoenixCreature extends mythicalCreature {
    PhoenixCreature() {
        super("Phoenix", 275, 17, 13, 17, 19);
    }
}

class PegasusCreature extends mythicalCreature {
    PegasusCreature() {
        super("Pegasus", 340, 14, 18, 20, 20);
    }
}

