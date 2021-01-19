public class Rectangle {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Instance Variables
    private int x;
    private int y;
    private int width;
    private int height;

    // Using this in a constructor
    public Rectangle(int width, int height) {
        this(1,1, width,height);
    }

    public Rectangle (int x, int y, int width, int height) { // Formal Paramters
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getCalc() {
        return x * y * width * height;
    }




}
