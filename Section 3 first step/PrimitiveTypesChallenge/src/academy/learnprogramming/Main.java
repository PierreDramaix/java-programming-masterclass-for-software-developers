package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte AnotherByte = 10;
        short AnotherShort = 20;
        int AnotherInt = 50;

        long AnotherLong = 50_000L + (( AnotherByte +  AnotherShort +  AnotherInt)*10L);
        System.out.println(AnotherLong);

        short shortTotal = (short) (1000 + 10 * (AnotherByte + AnotherInt + AnotherShort));

    }
}
