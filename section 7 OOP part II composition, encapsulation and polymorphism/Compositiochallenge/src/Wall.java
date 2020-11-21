public class Wall {

    public String color;
    public int width;
    public int lenght;

    public void wallDimension(int width, int lenght){
        System.out.println("The size of the wall are " + width * lenght + " square meters");
    }

    public Wall(String color, int width, int lenght) {
        this.color = color;
        this.width = width;
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }
}
