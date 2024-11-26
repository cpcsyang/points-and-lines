public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distanceTo(p2.getX(), p2.getY()));
        System.out.println(p1.distanceTo(p2));
    }
}
