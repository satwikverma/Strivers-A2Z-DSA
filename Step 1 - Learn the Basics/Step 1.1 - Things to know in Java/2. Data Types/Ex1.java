public class Point {
    int x;
    int y;

    public Point() {
    }
};

public class Ex1 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        System.out.println(p.x + " " + p.y);
    }
};