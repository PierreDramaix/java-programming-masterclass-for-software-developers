public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int result = 0;
        boolean isProvidedNumberPrime = true;
        boolean isFactorPrime = true;

        for (int k = 1; k <= number; k++){
            if(number % k == 0 && k != 1 && k != number){  //check if provided number is prime
                isProvidedNumberPrime = false;
                break;
            } else isProvidedNumberPrime = true;
        }

        if(isProvidedNumberPrime){
            result = number;
        } else {


            for (int i = 2; i < (number - 1); i++) {
                if (number % i == 0) {                           // check factor
                    for (int j = 1; j <= i ; j++) {
                        if (i % j == 0 && j != 1 && j != i) {   // check if factor is prime
                            isFactorPrime = false;
                            break;
                        } else isFactorPrime = true;
                    }

                    if (isFactorPrime){
                        result = i;
                    }
                }
            }
        }
        return result;
    }
}
