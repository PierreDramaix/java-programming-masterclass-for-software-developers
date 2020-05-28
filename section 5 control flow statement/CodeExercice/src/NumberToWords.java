public class NumberToWords {

    public static void numberToWords(int number){

            if(number < 0){
                System.out.println("Invalid Value");
            }

            int processedNumber = reverse(number);
            int digitCount = getDigitCount(number);

            for(int i = 1; i <= digitCount; i++ ){
                if(processedNumber % 10 == 0){
                    System.out.println("Zero");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 1){
                    System.out.println("One");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 2){
                    System.out.println("Two");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 3){
                    System.out.println("Three");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 4){
                    System.out.println("Four");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 5){
                    System.out.println("Five");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 6){
                    System.out.println("Six");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 7){
                    System.out.println("Seven");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 8){
                    System.out.println("Eight");
                    processedNumber /= 10;
                } else if (processedNumber % 10 == 9){
                    System.out.println("Nine");
                    processedNumber /= 10;
                }
            }
    }

    public static int reverse(int number){

        int result = 0;
        int processedNumber = number;

        while(processedNumber != 0){

            int remainder = processedNumber % 10;
            result *= 10;
            result += remainder;
            processedNumber /= 10;
        }

        return result;
    }

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }

        int result = 0;
        int processedNumber = number;

        if(processedNumber == 0){
            result++;
        }

        while (processedNumber != 0){
            result++;
            processedNumber /= 10;
        }

        return result;
    }
}
