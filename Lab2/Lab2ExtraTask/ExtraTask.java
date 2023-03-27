package Lab2ExtraTask;

public class ExtraTask {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(0, 3);

        Triangle ABC = new Triangle(A, B, C);

        double perimeter = ABC.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        double area = ABC.getArea();
        System.out.println("Area: " + area);

        Point bisectorIntersection = ABC.getBisectorIntersection();
        System.out.println("Bisector intersection: (" + bisectorIntersection.getX() + ", " + bisectorIntersection.getY() + ")");
    }
}
