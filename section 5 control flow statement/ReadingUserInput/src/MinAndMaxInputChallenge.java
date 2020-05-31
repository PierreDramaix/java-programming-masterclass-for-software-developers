import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void minAndMaxInputChallenge(){

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){

            System.out.println("Enter number : ");
            boolean isNumber = scanner.hasNextInt();

            if (!isNumber){
                System.out.println("The lowest provided number was : " + min);
                System.out.println("The highest provided number was : " + max);
                break;
            } else {
                int providedNumber = scanner.nextInt();
                if (providedNumber > max) {
                    max = providedNumber;
                }
                if (providedNumber < min){
                    min = providedNumber;
                }
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
