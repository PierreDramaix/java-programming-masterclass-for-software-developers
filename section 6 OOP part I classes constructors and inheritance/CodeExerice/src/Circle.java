public class Circle {

    private double radius;

    /*constructor*/

    public Circle(double radius) {

        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    /*other*/

    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }

    /*getter and setter*/

    public double getRadius() {
        return radius;
    }


}
