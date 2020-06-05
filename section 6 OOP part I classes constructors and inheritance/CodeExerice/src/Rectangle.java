public class Rectangle {

    private double width;
    private double length;

    /*constructor*/

    public Rectangle(double width, double length) {

        if (width < 0){
            width = 0;
        } else {
            this.width = width;
        }

        if(length < 0){
            length = 0;
        } else {
            this.length = length;
        }
    }

    /*other*/

    public double getArea(){
        return getLength() * getWidth();
    }

    /*getter and setter*/

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
