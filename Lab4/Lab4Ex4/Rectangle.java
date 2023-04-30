package Lab4Ex4;

import Lab4Ex1.Point;

public class Rectangle extends Shape{
    private final double width;
    private final double height;
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
}
