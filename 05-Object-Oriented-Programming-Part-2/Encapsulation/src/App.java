public class App {
    public static void main(String[] args) throws Exception {
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());
        // player.health = 200;
        // player.loseHealth(11);
        // System.out.println("Remaining health = " + player.healthRemaining());

        // EnhancedPlayer tim = new EnhancedPlayer("Tim");
        // or
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 100, "Sword");
        System.out.println("Inital health is " + tim.healthRemaining());
    }
}
