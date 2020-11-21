public class Furniture {

    public String furnitureType;
    public int furnitureDimension;
    public String furnitureColor;

    public void displayFurnitureColor(){
        System.out.println(this.furnitureColor);
    }

    public Furniture(String furnitureType, int furnitureDimension, String furnitureColor) {
        this.furnitureType = furnitureType;
        this.furnitureDimension = furnitureDimension;
        this.furnitureColor = furnitureColor;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public int getFurnitureDimension() {
        return furnitureDimension;
    }

    public String getFurnitureColor() {
        return furnitureColor;
    }
}
