package Lab2ExtraTask;

import java.util.Scanner;

public class ExtraTask {
    public static void main(String[] args) { /// 0 0 4 0 1 2
        // 0 -3 12 -12 3,36 -0,48
        System.out.println("Введите координаты точек в виде 6 double чисел");
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        double n5 = scanner.nextDouble();
        double n6 = scanner.nextDouble();
        Point A = new Point(n1, n2);
        Point B = new Point(n3, n4);
        Point C = new Point(n5, n6);

        Triangle ABC = new Triangle(A, B, C);

        double perimeter = ABC.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        double area = ABC.getArea();
        System.out.println("Area: " + area);

        Point bisectorIntersection = ABC.getBisectorIntersection();
        System.out.println("Bisector intersection: (" + bisectorIntersection.getX() + ", " + bisectorIntersection.getY() + ")");
    }
}
