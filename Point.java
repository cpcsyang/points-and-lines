public class Point {
    // properties/variables
    private double x;
    private double y;

    // constructor: how you create an object of this class
    public Point(int x, int y) {
        this((double) x, (double) y);
    }

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // methods/functions
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(double otherX, double otherY) {
        return Math.sqrt((x - otherX) * (x - otherX) + (y - otherY) * (y - otherY));
    }

    public double distanceTo(Point other) {
        return distanceTo(other.getX(), other.getY());
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
