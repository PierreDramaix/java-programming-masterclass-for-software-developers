public class SumOddRange {

    public static boolean isOdd(int number){

        if(number <= 0){
            return false;
        }
        else if (number % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end){

        if((start < 1) || (end < 1) || (end < start)){
            return -1;
        }

        int sumOdds = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sumOdds +=i;
            }
        }
        return sumOdds;
    }

}
