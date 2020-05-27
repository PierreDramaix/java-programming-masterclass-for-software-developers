public class EvenDigitSum {

    public static int getEvenDigitSum(int  number){

        if (number < 0){
            return -1;
        }

        int providedNumber = number;
        int lengthOfNumber = 0;

        while (providedNumber > 0){
            lengthOfNumber++;
            providedNumber /= 10;
        }

        int sum = 0;
        int providedNumber2 = number;

        for(int i = 1; i <= lengthOfNumber; i++){
            int currentDigit = providedNumber2 % 10;
            providedNumber2 /= 10;

            if (currentDigit % 2 == 0){
                sum +=currentDigit;
            }
        }

        return sum;

    }
}
