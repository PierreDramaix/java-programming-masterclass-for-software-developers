public class NumberPalindrome {

    public static boolean isPalindrome (int number){

        if (number < 0) {
            number = number - (number * 2);
        }

        int reverse = 0;
        int processedNumber = number;

        while (processedNumber > 0){

            int lastDigit = processedNumber % 10;
            reverse *= 10;
            reverse += lastDigit;

            processedNumber /= 10;
        }

        if (reverse == number) {
            return true;
        } else return false;


    }
}
