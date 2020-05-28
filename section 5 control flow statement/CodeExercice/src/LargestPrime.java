public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 0) {
            return -1;
        }

        int result = 0;


        for (int i = 2; i < (number - 1); i++) {
            if (number % i == 0) {
                for (int j = 2; j < (i - 1); i++) {
                    if (i % j == 0) {
                        break;
                    }
                }
                result = i;

/*        for (int i = (number - 1); i > 1; i--) {
            if (number % i == 0) {


                for(int j = (i -1); j > 1; j--){
                    if(i % j == 0){
                        break;
                    }
                }


                result = i;

            }*/


            }


        }
        return result;
    }
}
