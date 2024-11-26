public class Line {
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {
        return p1.distanceTo(p2);
    }

    public double getSlope() {
        try {
            return ((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
        }
        catch(Exception e) {
            System.out.println("Error");
            return Integer.MAX_VALUE;
        }
    }
}
