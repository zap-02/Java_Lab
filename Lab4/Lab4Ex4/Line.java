package Lab4Ex4;

import Lab4Ex1.Point;

public class Line extends Shape{
    private final Point to;
    public Line(Point pointFrom, Point to) {
        super(pointFrom);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        double centerX = (point.getX() + to.getX()) / 2;
        double centerY = (point.getY() + to.getY()) / 2;
        return new Point(centerX, centerY);
    }
}
