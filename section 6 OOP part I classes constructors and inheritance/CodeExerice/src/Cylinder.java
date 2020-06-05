public class Cylinder extends Circle{

    private double height;

    /*constructor*/

    public Cylinder(double radius, double height) {
        super(radius);

        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /*other*/

    public double getVolume(){
        return getArea() * getHeight();
    }

    /*getter and setter*/

    public double getHeight() {
        return height;
    }
}
