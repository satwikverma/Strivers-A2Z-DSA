public class Point {
    int x;
    int y;

    public Point() {
    }
};

public class Ex1 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;

        Point p2 = p1;
        p2.x = 30;
        System.out.println(p1.x + " " + p2.x);
    }
};

// Output :      30 30