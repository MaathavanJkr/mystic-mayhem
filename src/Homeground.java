public class Homeground {
    String name;

    public Homeground(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//extend Homeground for subclasses Hillcrest, Marshland, Desert and Arcane
class Hillcrest extends Homeground {
    Hillcrest() {
        super("Hillcrest");
    }
}

class Marshland extends Homeground {
    Marshland() {
        super("Marshland");
    }
}

class Desert extends Homeground {
    Desert() {
        super("Desert");
    }
}

class Arcane extends Homeground {
    Arcane() {
        super("Arcane");
    }
}