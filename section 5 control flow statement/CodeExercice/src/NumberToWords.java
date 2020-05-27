public class NumberToWords {

/*    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }

        int processedNumber = number;

        for(int i = 1; )



    }*/

/*    public static int reverse(int number){

        int result = 0;
        int processedNumber = number;
        int digitCount = getDigitCount(number);

        for(int i = 1; i <= digitCount; i++){
            if(i == 1){
                result += processedNumber % 10;
            }
        }

        return result;
    }*/

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }

        int result = 0;
        int processedNumber = number;

        while (processedNumber > -1){
            result++;
            processedNumber /= 10;
        }

        return result;

    }
}
