public class Knight extends Character{
    static boolean knightInstance=false;
    Knight(String name, int price, int attack, int defence, int health, int speed) {
        super(name, price, attack, defence, health, speed);
    }

    static void setKnightInstance() {
        knightInstance = true;
    }
}


class Squire extends Knight {
    Squire() {
        super("Squire", 85, 8, 9, 7, 8);
        Knight.setKnightInstance();
    }
}

class Cavalier extends Knight {
    Cavalier() {
        super("Cavalier", 110, 10, 12, 7, 10);
        Knight.setKnightInstance();
    }
}

class Templar extends Knight {
    Templar() {
        super("Templar", 155, 14, 16, 12, 12);
        Knight.setKnightInstance();
    }
}

class Zoro extends Knight {
    Zoro() {
        super("Zoro", 180, 17, 16, 13, 14);
        Knight.setKnightInstance();
    }
}

class Swiftblade extends Knight {
    Swiftblade() {
        super("Swiftblade", 250, 18, 20, 17, 13);
        Knight.setKnightInstance();
    }
}

