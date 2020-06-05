public class Main {

    public static void main(String[] args) {

        /*SimpleCalculator*/

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add= " + simpleCalculator.getAdditionResult());
        System.out.println("substract= " + simpleCalculator.getSubtractionResult());

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + simpleCalculator.getMultiplicationResult());

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

        System.out.println("************");

        /*Wall*/

        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());

        System.out.println("************");

        /*Point*/

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        System.out.println("************");

        /*Floor, Carpet, Calculator*/

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        System.out.println("************");

        /*ComplexNumber*/

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);

        one.add(1.0,1.0);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        System.out.println("************");

        /*circle and cylinder*/

        Circle circle = new Circle(3.75);
        System.out.println("circle radius = " + circle.getRadius());
        System.out.println("circle area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder radius = " + cylinder.getRadius());
        System.out.println("cylinder height = " + cylinder.getHeight());
        System.out.println("cylinder area = " + cylinder.getArea());
        System.out.println("cylinder volum = " + cylinder.getVolume());

        System.out.println("************");

        /*Rectangle and cuboid*/

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectange width= " + rectangle.getWidth());
        System.out.println("rectange length= " + rectangle.getLength());
        System.out.println("rectange area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid width = " + cuboid.getWidth());
        System.out.println("cuboid length = " + cuboid.getLength());
        System.out.println("cuboid area = " + cuboid.getArea());
        System.out.println("cuboid height = " + cuboid.getHeight());
        System.out.println("cuboid volume = " + cuboid.getVolume());

        System.out.println("************");




    }
}
