import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void readingUserInputChallenge (){

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true){

            int order = count + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isNumber = scanner.hasNextInt();               // ensure the provided data is a number

            if(isNumber){
                count++;
                int providedNumber = scanner.nextInt();              // as we know its a number we will register it
                sum += providedNumber;

                if(count == 10){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("The sum of the provided number is " + sum);
        scanner.close();
    }
}


