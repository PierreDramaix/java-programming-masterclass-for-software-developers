public class Main {
    public static void main(String[] args) {
       boolean test = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(test);

        test = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(test);

        test = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(test);

        test = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(test);
    }
}
