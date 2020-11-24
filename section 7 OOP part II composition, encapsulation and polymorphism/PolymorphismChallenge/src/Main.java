class Car{

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinder;


    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }


    public String startEngine(){
        return "Engine started";
    }

    public String stopEngine(){
        return "Engine stopped";
    }

    public String accelerate(){
        return "Acceleration";
    }

    public String brake(){
       return "Deceleration";
    }
}

class Powerful extends Car{

    public Powerful(String name, int cylinder) {
        super(name, cylinder);
        System.out.println("Powerful car created");
    }

    @Override
    public String startEngine() {
        return  "Powerful started engine";
    }

    @Override
    public String stopEngine() {
        return "Powerful stopped engine";
    }

    @Override
    public String accelerate() {
        return "Powerful accelerate";
    }

    @Override
    public String brake() {
        return "Powerful brake";
    }
}

class Audi extends Car{
    public Audi(String name, int cylinder) {
        super(name, cylinder);
        System.out.println("Audi car created");
    }

    @Override
    public String startEngine() {
        return  "Audi started engine";
    }

    @Override
    public String stopEngine() {
        return "Audi stopped engine";
    }

    @Override
    public String accelerate() {
        return "Audi accelerate";
    }

    @Override
    public String brake() {
        return "Audi brake";
    }

}

class Old extends Car{
    public Old(String name, int cylinder) {
        super(name, cylinder);
        System.out.println("Old car created");
    }

    @Override
    public String startEngine() {
        return  "Old started engine";
    }

    @Override
    public String stopEngine() {
        return "Old stopped engine";
    }

    @Override
    public String accelerate() {
        return "Old accelerate";
    }

    @Override
    public String brake() {
        return "Old brake";
    }

}


public class Main {

    public static void main(String[] args) {

        Powerful powerful = new Powerful("p",6);
        Audi audi = new Audi("a",4);
        Old old = new Old("o",2);

        System.out.println(powerful.getCylinder());
        System.out.println(old.getName());

        System.out.println(powerful.brake());
        System.out.println(audi.startEngine());

    }
}
