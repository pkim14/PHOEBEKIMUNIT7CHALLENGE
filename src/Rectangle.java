import java.util.List;
import java.util.Random;

public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "Rectangle at (" + x + ", " + y + ") with length " + length + " and width " + width;
    }
}
