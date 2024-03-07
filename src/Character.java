public abstract class Character {

    String name;
    int price;

    int attack;

    int defence;

    int health;

    int speed;

    String category;



    Character(String name,int price,int attack ,int defence,int health,int speed,String category){
        this.name=name;
        this.price=price;
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.speed=speed;
        this.category=category;
    }




}
