public class House {

    private Room houseRoom;
    private int houseRoomNumber;

    public House(Room houseRoom, int houseRoomNumber) {
        this.houseRoom = houseRoom;
        this.houseRoomNumber = houseRoomNumber;
    }

    public Room getHouseRoom() {
        return houseRoom;
    }

    public int getHouseRoomNumber() {
        return houseRoomNumber;
    }
}
