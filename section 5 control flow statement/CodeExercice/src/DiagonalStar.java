public class DiagonalStar {

    public static void printSquareStar(int number){

        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for ( int i = 1; i <= number; i++ ){  //i = row and k = column
            for(int k = 1; k <= number; k++){
                if((i == 1 || i == number)
                        ||  (k == 1 || k == number)
                        || (i == k)
                        || (k == (number - i + 1))){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
