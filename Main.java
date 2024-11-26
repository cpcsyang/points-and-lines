public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Point p1 = new Point(0, 0);
        System.out.println(p1);
        p1.setX(4);
        p1.setY(3);
        System.out.println(p1);
    }
}
