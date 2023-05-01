package Lab4Ex5;


import Lab4Ex1.Point;


public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Point getCenter() {
        return super.point;
    }

    @Override
    public Circle clone() {
        try {
            Circle clonedCircle = (Circle) super.clone();
            clonedCircle.radius = this.radius;
            return clonedCircle;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}




