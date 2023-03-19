package Lab2Ex6;

public class Lab2Ex6 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.printf( "x= " + p.getX() + "\ny= " + p.getY() );
    }
}