public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        boolean result = false;

        if (bigCount < 0 || smallCount < 0 ||goal < 0){
            return result;
        }

        int bigKilos = bigCount * 5;
        int smallKilos = smallCount * 1;
        int sum = bigKilos + smallKilos;


        if(sum == goal){
            result = true;
        }  else if ( sum > goal){

            if (bigKilos < goal) {
                result = true;
            } else if ( goal % 5 == 0) {
                result = true;
            } else if (goal / bigCount <= bigCount && goal % 5 <= smallKilos ){
                result = true;
            }
        } else {
            result = false;
        }

        return result;
    }
}
