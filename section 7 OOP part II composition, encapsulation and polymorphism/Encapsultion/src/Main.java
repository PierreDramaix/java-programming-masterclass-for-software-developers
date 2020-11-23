public class Main {

    public static void main(String[] args) {

/*            Player player = new Player();
            player.name = "Pierre";
            //player.health = 20;
            player.weapon = "Mace";

        System.out.println(player.health);

            int damage = 10;
            player.loseHealth(damage);
            System.out.println("Remaining health = " + player.healthRemaining());

            damage = 11;
            player.loseHealth(damage);
            System.out.println("Remaining health = " + player.healthRemaining());*/


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Pierre", 50, "Mace");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
