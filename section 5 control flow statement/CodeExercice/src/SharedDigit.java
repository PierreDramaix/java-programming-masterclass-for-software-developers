public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){

        boolean result = false;

        int processedNumber1 = number1;
        int processedNumber2 = number2;
        int firstNumber1 = 0;
        int secondNumber1 = 0;
        int firstNumber2 = 0;
        int secondNumber2 = 0;

        for ( int i = 1; i <= 2; i++){
            if (i == 1){
                firstNumber1 = processedNumber1 % 10;
                firstNumber2 = processedNumber2 % 10;

                processedNumber1 /= 10;
                processedNumber2 /= 10;

            } else {
                secondNumber1 =  processedNumber1;
                secondNumber2 =  processedNumber2;
            }
        }

        if (firstNumber1 == secondNumber1 ||
                firstNumber1 == firstNumber2 ||
                firstNumber1 == secondNumber2 ||
                secondNumber1 == firstNumber2 ||
                secondNumber1 == secondNumber2 ||
                firstNumber2 == secondNumber2) {
            result = true;
        }

        if ( (number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            result = false;
        }

        return result;

    }
}
