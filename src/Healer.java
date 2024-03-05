public class Healer extends Character{
    Healer(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }
}

class Soother extends Healer {
    Soother() {
        super("Soother", 95, 10, 8, 9, 6);
    }
}

class Medic extends Healer {
    Medic() {
        super("Medic", 125, 12, 9, 10, 7);
    }
}

class Alchemist extends Healer {
    Alchemist() {
        super("Alchemist", 150, 13, 13, 13, 13);
    }
}

class Saint extends Healer {
    Saint() {
        super("Saint", 200, 16, 14, 17, 9);
    }
}

class Lightbringer extends Healer {
    Lightbringer() {
        super("Lightbringer", 260, 17, 15, 19, 12);
    }
}

