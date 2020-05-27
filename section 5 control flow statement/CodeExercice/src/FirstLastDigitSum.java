public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if ( number < 0){
            return -1;
        }

        int lengthOfNumber = 0;
        int providedNumber = number;

        while (providedNumber > 0){
            lengthOfNumber++;
            providedNumber /= 10;
        }

        int sum = 0;
        int providedNumber2 = number;

        if(lengthOfNumber == 1){
            sum = number * 2;
        } else {

            for (int i = 1; i <= lengthOfNumber;i++ ){
                if (i == 1){
                    sum += providedNumber2 % 10;
                    providedNumber2 /= 10;

                } else if( i == lengthOfNumber){
                    sum += providedNumber2;
                } else {
                    providedNumber2 /= 10;
                }
            }
        }

        return sum;
    }
}

