public class Calculator {

    private Floor floor;
    private Carpet carpet;

    /*constructor*/

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    /*other*/

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
