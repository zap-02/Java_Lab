package Lab4Ex4;

import Lab4Ex1.Point;

public class Circle extends Shape{
    private final double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }
    @Override
    public Point getCenter() {
        return super.point;
    }

    public double getRadius() {
        return radius;
    }
}
