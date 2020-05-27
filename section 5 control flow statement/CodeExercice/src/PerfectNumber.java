public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        boolean result = false;
        int sumFactors = 0;

        for(int i = 1; i < number;i++){
            if(number % i == 0){
                sumFactors += i;
            }
        }

        if(sumFactors == number){
            result = true;
        }


        if(number < 1){
            result = false;
        }
        return result;
    }
}
