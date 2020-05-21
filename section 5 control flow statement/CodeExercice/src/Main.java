public class Main {
    public static void main(String[] args) {

        /*NumberInWord*/

/*        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(-5);
        NumberInWord.printNumberInWord(12);
        NumberInWord.printNumberInWord(5);*/

        /*NumbersOfDaysInMonth*/

        System.out.println(NumbersOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumbersOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(1,-2020));

    }
}
