public class LineSegment {
    private Point2D start;
    private Point2D end;

    public LineSegment(Point2D start, Point2D end) {
        if (start == null || end == null) {
            throw new NullPointerException();
        }
        if (start.getX() < 0 || start.getY() < 0){
            throw new IllegalArgumentException();
        }
        if (end.getX() < 0 || end.getY() < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.start = start;
            this.end = end;
        }
    }

    public LineSegment(){
        this.start = new Point2D(0,0);
        this.end = new Point2D(0,0);
    }

    public LineSegment(LineSegment other){
        this.start = other.start;
        this.end = other.end;
    }

    public Point2D getStart() { return new Point2D(start); }

    public Point2D getEnd() { return new Point2D(end); }

    public void setStart(Point2D start) {
        if (start != null) {
            this.start = start;
        }

        if (start.getX() < 0 || start.getY() < 0){
            throw new IllegalArgumentException();
        }
    }
    public void setEnd(Point2D end) {
        if (end != null) {
            this.end = end;
        }

        if (end.getX() < 0 || end.getY() < 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "LineSegment: start = " + start.toString() +
                ", end = " + end.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point2D)) {
            return false;
        }
        if (this == other) {
            return true;
        }

        LineSegment that = (LineSegment) other;
        return this.start == that.start && this.end == that.end;
    }

    public double getDistance() {
        if (start == null || end == null) {
            throw new NullPointerException();
        }

        double dx = this.start.getX() - this.end.getX();
        double dy = this.start.getY() - this.end.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);

        return distance;
    }
}
