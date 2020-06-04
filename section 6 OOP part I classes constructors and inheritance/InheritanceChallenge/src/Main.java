public class Main {

    public static void main(String[] args) {

        Fiat test = new Fiat(false,0,0,true);

        test.acceleration(80);

        System.out.println(test.isMoving());
        System.out.println(test.getSpeed());
        System.out.println(test.getGearNumber());
        System.out.println(test.isHandSteering());

        test.decceleration(50);

        System.out.println(test.isMoving());
        System.out.println(test.getSpeed());
        System.out.println(test.getGearNumber());
        System.out.println(test.isHandSteering());

        System.out.println("*******");

        Fiat test2 = new Fiat(false,0,0,false);

        test2.acceleration(100);

        System.out.println(test2.isMoving());
        System.out.println(test2.getSpeed());
        System.out.println(test2.getGearNumber());
        System.out.println(test2.isHandSteering());

        test2.decceleration(20);

        System.out.println(test2.isMoving());
        System.out.println(test2.getSpeed());
        System.out.println(test2.getGearNumber());
        System.out.println(test2.isHandSteering());


    }
}
