public class Main {

    public static void main(String[] args) {

        String numberAsStringInteger = "2018";
        System.out.println(numberAsStringInteger);

        String numberAsStringDouble = "2018.125";
        System.out.println(numberAsStringDouble);

        int numberInteger = Integer.parseInt(numberAsStringInteger);
        numberInteger++;
        System.out.println(numberInteger);

        double numberdouble = Double.parseDouble(numberAsStringDouble);
        numberdouble++;
        System.out.println(numberdouble);
        

    }
}
