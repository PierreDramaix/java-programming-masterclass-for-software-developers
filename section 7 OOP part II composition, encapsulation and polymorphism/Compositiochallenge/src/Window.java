public class Window {

    public int windowNumber;
    public String windowType;
    public int width;
    public int lenght;

    public void getWindowDimension(int width, int lenght){
        System.out.println("Window dimension is " + width * lenght + " square meters");
    }

    public Window(int windowNumber, String windowType, int width, int lenght) {
        this.windowNumber = windowNumber;
        this.windowType = windowType;
        this.width = width;
        this.lenght = lenght;
    }

    public int getWindowNumber() {
        return windowNumber;
    }

    public String getWindowType() {
        return windowType;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }
}
