public class Cuboid extends  Rectangle{

    private double height;

    /*constructor*/

    public Cuboid(double width, double length, double height) {
        super(width, length);

        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /*other*/

    public double getVolume(){
        return getHeight()*getArea();
    }

    /*getter*/

    public double getHeight() {
        return height;
    }
}
