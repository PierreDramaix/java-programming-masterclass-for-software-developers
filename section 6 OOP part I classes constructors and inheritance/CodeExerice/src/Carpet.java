public class Carpet {

    private double cost;

    /*constructor*/

    public Carpet(double cost) {

        if(cost <  0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    /*getter*/

    public double getCost() {
        return cost;
    }
}
