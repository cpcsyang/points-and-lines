public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Point p1 = new Point(1, 1);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);
        Point p3 = new Point(1.5, 3.7);
        System.out.println(p3);
//        Point p2 = new Point(0, 0);
//        p2.translate(3, 4);
//        System.out.println(p1.distanceTo(p2.getX(), p2.getY()));
    }
}
