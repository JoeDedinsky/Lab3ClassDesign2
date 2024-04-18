public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /* Answer:
    We don't need getters or setters since "other"
    already has these methods
     */
    public Point2D(Point2D other){ this.x = other.x; this.y = other.y; }

    public void setX(int nX) {
        this.x = nX;
    }

    public void setY(int nY) {
        this.y = nY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setToOrigin() {
        this.x = 0; this.y = 0;
    }

    public void translate(int dx, int dy) {
        this.x += dx; this.y += dy;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Point2D)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        Point2D that = (Point2D) other;
        return this.x == that.x && this.y == that.y;
    }
}
