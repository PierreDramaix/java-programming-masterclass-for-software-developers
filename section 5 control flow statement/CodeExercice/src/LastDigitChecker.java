public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        boolean result = false;

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        if(lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit3 == lastDigit1){
            result = true;
        }

        if ((number1 < 10 || number1 > 999) || (number2 < 10 || number2 > 999) ||(number3 < 10 || number3 > 999)){
            result = false;
        }
        return result;
    }

    public static boolean isValid(int number){

        if(number > 9 && number < 1001){
            return true;
        } else return false;
    }
}
