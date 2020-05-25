public class ChallengeDigitSum {

    public static int sumDigits(int number){

        if(number <= 9){
            return -1;
        }

        int sum = 0;
        int num = number; //useless step, as per solution provided below
        int numberLeft = 1;

        while(numberLeft != 0){
            sum += num % 10;
            num = num / 10 ;
            numberLeft = num;
        }
        return sum;
    }

    // Provided solution:

    static public int providedSolution (int number){

        if(number <= 9){
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum += digit;

            number /= 10; //I dont have to isolate the remainings number to compute for itch iteration, java can process changes on the
                            // provided input
        }

        return  sum;
    }
}
