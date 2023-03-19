public class Lab2Ex5 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf( "x= " + p.getX() + "\ny= " + p.getY() );
    }
}
