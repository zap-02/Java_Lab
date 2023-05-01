package Lab4Ex5;

import Lab4Ex1.Point;

public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double centerX = point.getX() + (width / 2);
        double centerY = point.getY() + (height / 2);
        return new Point(centerX, centerY);
    }

    @Override
    public Rectangle clone() {
        try {
            Rectangle clone = (Rectangle) super.clone();
            clone.width = this.width;
            clone.height = this.height;

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

