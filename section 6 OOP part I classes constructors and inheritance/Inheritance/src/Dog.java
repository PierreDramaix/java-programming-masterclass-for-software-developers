public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /*constructor*/

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    /*others*/

    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() was called");
        super.move(5);
    }

    public void run(){
        System.out.println("dog.run() was called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("dog.movelegs was called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() was called");
        moveLegs(speed);
        super.move(speed);
    }


}
