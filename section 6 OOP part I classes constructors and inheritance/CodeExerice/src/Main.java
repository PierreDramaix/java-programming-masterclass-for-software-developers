public class Main {

    public static void main(String[] args) {

        /*SimpleCalculator*/

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("substract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getMultiplicationResult());

        System.out.println("************");

        /*Person*/

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("Teen= " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullname= " + person.getFullName());

    }
}
