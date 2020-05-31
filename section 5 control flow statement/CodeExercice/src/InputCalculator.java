import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(!isAnInt){
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            } else {
                int providedNUmber = scanner.nextInt();
                sum += providedNUmber;
                count++;
                avg = Math.round((double) sum / (double) count);
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
