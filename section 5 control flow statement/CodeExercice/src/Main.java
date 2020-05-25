public class Main {
    public static void main(String[] args) {

        /*NumberInWord*/

        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(-5);
        NumberInWord.printNumberInWord(12);
        NumberInWord.printNumberInWord(5);

        System.out.println("***************");

        /*NumbersOfDaysInMonth*/

        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));

        System.out.println("***************");

        /*SumOddRange*/

        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(1,1000));

        System.out.println("***************");

        /*NumberPalindrome*/

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println("***************");

    }
}
