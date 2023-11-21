package cw.sem5.Podskazki;

public class LOocalClass {
    public static void main(String[] args) {


    // локальный (внутри метода)
    class Point {
        int x;
        int y;

        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    Point p = new Point(2, 4);
        System.out.println("p = " + p);
}
}

