public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        p2.translate(3, 4);
        System.out.println(p1.distanceTo(p2.getX(), p2.getY()));
    }
}
