public class Main {

    public static void main(String[] args) {

        int count = 1;

        for(count = 1; count != 6;  count++){
            System.out.println("Count value is " + count);
        }

        System.out.println("******");

        count = 1;

        while(count != 6){
            System.out.println("Count value is " + count);
            count++;

        }

        System.out.println("******");

        count = 6;

        do {
            System.out.println("Count value is " + count);
            count++;
            if(count > 100){
                break;
            }
        } while (count != 6);

        System.out.println("******");

        int number = 4;
        int finishNumber = 20;
        int countEvenNumber = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            countEvenNumber++;
            System.out.println("Even number " + number);

            if(countEvenNumber == 5){
                System.out.println("Number of even number found is " +countEvenNumber);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){

        return number % 2 == 0;

    }

}
