package Lab4Ex4;

import Lab4Ex1.Point;

public class Line extends Shape{
    private final Point pointTo;
    public Line(Point pointFrom, Point pointTo) {
        super(pointFrom);
        this.pointTo = pointTo;
    }

    @Override
    public Point getCenter() {
        double centerX = (point.getX() + pointTo.getX()) / 2;
        double centerY = (point.getY() + pointTo.getY()) / 2;
        return new Point(centerX, centerY);
    }
}
