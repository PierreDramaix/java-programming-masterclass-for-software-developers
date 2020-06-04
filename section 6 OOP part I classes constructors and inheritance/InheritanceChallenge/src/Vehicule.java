public class Vehicule {

    boolean moving;
    int speed;


    /*constructor*/

    public Vehicule(boolean moving, int speed) {
        this.moving = moving;
        this.speed = speed;

    }

    /*   other*/
    public void acceleration(int speed){

        int newCelerity =  this.speed + speed;

    }

    public void decceleration(int speed){

        int newCelerity =  this.speed - speed;
        isMovingNow(newCelerity);
    }

   public boolean isMovingNow(int speed){

        if(speed <= 0){
            return this.moving = false;
        } else return this.moving = true;

   }



    /*   getter and setter*/

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {

        this.moving = moving;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

