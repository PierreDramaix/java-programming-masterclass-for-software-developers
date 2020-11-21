public class Main {
    public static void main(String[] args) {

        Door bedRoomDoor = new Door (1, "composite", 2,6);
        Furniture bedRoomFurniture = new Furniture("bed", 25, "yellow");
        Window bedRoomWindow = new Window(8, "double", 3,3);
        Wall bedRoomWall  = new Wall("pink", 4, 4);

        Room bedRoom = new Room(bedRoomWall, bedRoomWindow, bedRoomFurniture, bedRoomDoor);
        House theHouse = new House(bedRoom, 3);


        theHouse.getHouseRoom().getTheDoor().doorDimension(2,6);

        theHouse.getHouseRoom().getTheFurniture().displayFurnitureColor();

    }
}
