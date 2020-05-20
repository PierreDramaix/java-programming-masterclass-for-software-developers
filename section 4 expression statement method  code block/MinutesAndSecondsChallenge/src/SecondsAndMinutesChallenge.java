 public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

        public static String getDurationString(long minutes, long seconds){

            if(minutes < 0 || seconds < 0 || seconds > 59){
                return INVALID_VALUE_MESSAGE;
            } else {
                long remainderMinutes = minutes % 60;
                long hours =  minutes / 60;

                String hourString = hours + "h";
                if (hours < 10){
                    hourString = "0" + hourString;
                }

                String minuteString = remainderMinutes + "m";
                if (minutes < 10){
                    minuteString = "0" + minuteString;
                }

                String secondString = seconds + "s";
                if(seconds < 10){
                    secondString = "0" + secondString;
                }

                return hourString + " " + minuteString + " " + secondString;
            }
        }

        public static String getDurationString(long seconds){
            if(seconds < 0){
                return INVALID_VALUE_MESSAGE;
            } else {
                long remainderSeconds = seconds % 60;
                long secondsToMinutes = seconds / 60;
                return getDurationString(secondsToMinutes, remainderSeconds);
            }
        }
    }
