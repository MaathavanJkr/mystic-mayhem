public class Healer extends Character{
    Healer(String name, int price, int attack, int defence, int health, int speed,String category) {
        super(name, price, attack, defence, health, speed,category);
    }
}

class Soother extends Healer {
    Soother() {
        super("Soother", 95, 10, 8, 9, 6,"Sunchildren");
    }
}

class Medic extends Healer {
    Medic() {
        super("Medic", 125, 12, 9, 10, 7,"Highlanders");
    }
}

class Alchemist extends Healer {
    Alchemist() {
        super("Alchemist", 150, 13, 13, 13, 13,"Marshlanders");
    }
}

class Saint extends Healer {
    Saint() {
        super("Saint", 200, 16, 14, 17, 9,"Mystics");
    }
}

class Lightbringer extends Healer {
    Lightbringer() {
        super("Lightbringer", 260, 17, 15, 19, 12,"Sunchildren");
    }
}
