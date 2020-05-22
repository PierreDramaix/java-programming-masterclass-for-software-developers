public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10_000,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10_000,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10_000,5.0));

        for(int i=0; i < 5 ; i++){
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("***********");

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + " % interest = " + calculateInterest(10_000,i));
        }

        System.out.println("***********");

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10_000,i)));

        }

        System.out.println("***********");

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + " % interest = " + calculateInterest(10_000,i));
        }

        System.out.println("***********");

        System.out.println(isPrime(17));
        System.out.println(isPrime(8));



        forChallenge();

        System.out.println("***********");

        int sum = 0;
        int numberfound = 0;

        for (int i = 1; i <= 1_000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                numberfound++;
                System.out.println("Found number " + i);
            }
            if (numberfound == 5){
                System.out.println(sum);
                break;
            }
        }
        
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for( int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void forChallenge(){

        int numberOfPrime = 0;

        for (int i = 10; i < 50; i++){
            if(isPrime(i)){
                numberOfPrime++;
                System.out.println(i + " is a prime number");

                if (numberOfPrime == 10){
                    break;
                }
            }
        }
        System.out.println("I stopped at 10 prime number found as requested");

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

}
