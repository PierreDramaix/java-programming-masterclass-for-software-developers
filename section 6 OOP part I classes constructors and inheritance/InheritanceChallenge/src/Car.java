public class Car extends Vehicule {

    int gearNumber; // 1 to 6

    /*constructor*/

    public Car(boolean moving, int speed, int gearNumber) {
            super(moving, speed);
            this.gearNumber = gearNumber;
    }

    /*   other*/



    public int changeGear(int speed){

        if(speed <= 0){
            this.gearNumber = 0;
        } else if(speed < 20){
            this.gearNumber = 1;
        } else if(speed < 40){
            this.gearNumber = 2;
        } else if(speed < 60){
            this.gearNumber = 3;
        } else if(speed < 80){
            this.gearNumber = 4;
        }else if(speed < 100){
            this.gearNumber = 5;
        }else if(speed > 100){
            this.gearNumber = 6;
        }

        return this.gearNumber;
    }

    /*    getter and setter*/

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }
}
