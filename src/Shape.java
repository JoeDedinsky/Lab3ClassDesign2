import java.awt.Color;
import java.awt.Graphics;

public class Shape {
    private int x;
    private int y;
    private Color color;

    public Shape() {

    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() { return this.x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return this.y; }

    public void setY(int y) { this.y = y; }

    public Color getColor() { return this.color;}

    public void setColor(Color color) { this.color = color; }

    public int getArea() { return -1; }

    public void draw(Graphics g) { }

    @Override
    public String toString() {
        return "Shape [x=" + x + ", y=" + y + ", color=" + color + "]";
    }
}

