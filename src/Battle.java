public class Battle {
    Player player1;
    Player player2;

    public Battle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Battle started between " + player1.getName() + " and " + player2.getName());
    }
}
