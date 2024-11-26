public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 6);
        System.out.println(p1);
        System.out.println(p2);
        Line l1 = new Line(p1, p2);
        System.out.println("Length is " + l1.getLength());
        System.out.println("Slope is " + l1.getSlope());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
