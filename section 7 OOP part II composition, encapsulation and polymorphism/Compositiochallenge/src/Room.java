public class Room {

        public String roomType;
        private Wall roomWall;
        private Window roomWindow;
        private Furniture roomFurniture;
        private Door roomDoor;

        public Room(Wall roomWall, Window roomWindow, Furniture roomFurniture, Door roomDoor) {
                this.roomType = roomType;
                this.roomWall = roomWall;
                this.roomWindow = roomWindow;
                this.roomFurniture = roomFurniture;
                this.roomDoor = roomDoor;
        }


        public String getRoomType(){
                return roomType;
        }

        public Wall getTheWall() {
                return roomWall;
        }

        public Window getTheWindow() {
                return roomWindow;
        }

        public Furniture getTheFurniture() {
                return roomFurniture;
        }

        public Door getTheDoor() {
                return roomDoor;
        }
}
