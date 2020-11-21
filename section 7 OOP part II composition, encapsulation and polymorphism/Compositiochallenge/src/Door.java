public class Door {

    public int doorNumber;
    public String doorType;
    public int lenght;
    public int width;

    public void doorDimension(int lenght, int width){

        System.out.println("Door dimension is " + lenght * width + " square meters");
    }

    public Door(int doorNumber, String doorType, int lenght, int width) {
        this.doorNumber = doorNumber;
        this.doorType = doorType;
        this.lenght = lenght;
        this.width = width;
    }

/*    public int getDoorNumber() {
        return doorNumber;
    }

    public String getDoorType() {
        return doorType;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }*/
}
