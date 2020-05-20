public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){

        if(summer == false){
            if(temperature < 25 || temperature > 35){
                return false;
            } else {
                return true;
            }
        } else {
            if (temperature < 25 || temperature > 45){
                return false;
            } else {
                return true;
            }
        }
    }
}
