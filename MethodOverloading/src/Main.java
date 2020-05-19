public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(2d,4d));
        System.out.println(calcFeetAndInchesToCentimeters(575.0d));


    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player" + playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name. no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            double feetToInches = feet * 12;
            double totalInches = feetToInches + inches;
            return totalInches * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0){
            int inchesToFeet = (int) inches / 12;
            double remainingInches = inches  % 12;
            return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);

        } else {
            return -1;
        }
    }

}
