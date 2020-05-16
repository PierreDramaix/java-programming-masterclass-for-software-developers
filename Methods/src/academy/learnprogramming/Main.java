package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculatedScore(true, 1000,12,350);
        System.out.println("Your final score was " + highScore);

        String playerName = "Roberta";
        score = 1100;
        int highScorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName, highScorePosition);

        playerName = "Paul";
        score = 800;
        highScorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName, highScorePosition);

        playerName = "Charles";
        score = 250;
        highScorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName, highScorePosition);

        playerName = "Jacob";
        score = 25;
        highScorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName, highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculatedHighScorePosition(int score){
/*        if(score >= 1000){return 1;}
        else if (score >= 500){return 2;}
        else if (score >= 100){return 3;}
        return 4;*/

       int position = 4; //we assume position will be returned

        if(score >= 1000){position = 1;}
        else if (score >= 500){position = 2;}
        else if (score >= 100){position = 3;}
        return position;
        
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else { return -1;}
    }
}
