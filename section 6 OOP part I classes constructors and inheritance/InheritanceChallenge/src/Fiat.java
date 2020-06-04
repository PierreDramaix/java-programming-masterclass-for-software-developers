public class Fiat extends Car {

    boolean Gear;


    /*constructor*/

    public Fiat(boolean moving, int speed, int gearNumber, boolean handSteering) {
        super(moving, speed, gearNumber);
        this.Gear = handSteering;
    }

    /*   other*/

    public void steer(){
        if(Gear){
            System.out.println("the driver manually changed gear to " + this.gearNumber + " while going at " + this.speed);
        } else {
            System.out.println("The car automatically changed gear to " + this.gearNumber + " while going at " + this.speed);
        }
    }

    @Override
    public void acceleration(int speed) {

        this.speed =  getSpeed() + speed;

        isMovingNow(this.speed);
        changeGear(this.speed);
        steer();

        setSpeed(this.speed);

    }

    @Override
    public void decceleration(int speed) {

        this.speed =  getSpeed() - speed;
        isMovingNow(this.speed);
        changeGear(this.speed);
        steer();

        setSpeed(this.speed);

    }

    /*    getter and setter*/

    public boolean isHandSteering() {
        return Gear;
    }

    public void setHandSteering(boolean handSteering) {
        this.Gear = handSteering;
    }


}
