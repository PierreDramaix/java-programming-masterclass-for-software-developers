public class Main {

    public static void main(String[] args) {

        boolean test = LeapYear.isLeapYear(-1600);
        System.out.println(test);

        test = LeapYear.isLeapYear(1600);
        System.out.println(test);

        test = LeapYear.isLeapYear(-2017);
        System.out.println(test);

        test = LeapYear.isLeapYear(2000);
        System.out.println(test);

        int test1 = 1924 % 4;
        System.out.println(test1);

        test1 = 1924 % 100;
        System.out.println(test1);

        test1 = 1924 % 400;
        System.out.println(test1);



    }
}

