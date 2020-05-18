public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){

/*        if (firstNumber / 1000 == secondNumber / 1000){
            return true;
        } else {
            return false;
        }*/

        double conversionFirstNumber = firstNumber * 1000;
        double  conversionSecondNumber = secondNumber * 1000;

/*        System.out.println(conversionFirstNumber);
        System.out.println(conversionSecondNumber);*/

        if ((int) conversionFirstNumber == (int)  conversionSecondNumber) {
            return true;
        } else {
            return false;
        }
    }
}
