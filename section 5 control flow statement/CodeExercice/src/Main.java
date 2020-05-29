public class Main {
    public static void main(String[] args) {

        /*NumberInWord*/

        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(-5);
        NumberInWord.printNumberInWord(12);
        NumberInWord.printNumberInWord(5);

        System.out.println("***************");

        /*NumbersOfDaysInMonth*/

        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));

        System.out.println("***************");

        /*SumOddRange*/

        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(13,13));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(1,1000));

        System.out.println("***************");

        /*NumberPalindrome*/

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println("***************");

        /*FirstLastDigitSum*/

        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));

        System.out.println("***************");

        /*EvenDigitSum*/

        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

        System.out.println("***************");

        /*SharedDigit*/

        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));

        System.out.println("***************");

        /*LastDigitChecker*/

        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));

        System.out.println("***************");

        System.out.println(LastDigitChecker.isValid(10));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));

        System.out.println("***************");

        /*GreatestCommonDivisor*/

        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));

        System.out.println("***************");

        /*FactorPrinter*/

        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);

        System.out.println("***************");

        /*PerfectNumber*/

        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));

        System.out.println("***************");

        /*NumberToWords*/

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));

        System.out.println("***************");

        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));

        System.out.println("***************");

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        System.out.println("***************");

        /*FlourPacker*/

        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
        System.out.println(FlourPacker.canPack(2,2,11));
        System.out.println(FlourPacker.canPack(-3,2,12));
        System.out.println(FlourPacker.canPack(4,18,19));
        System.out.println(FlourPacker.canPack(5,3,24));

        System.out.println("***************");

        /*LargestPrime*/

        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(7));

        System.out.println("***************");

        /*DiagonalStar*/

        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);
        DiagonalStar.printSquareStar(2);

        System.out.println("***************");

    }
}