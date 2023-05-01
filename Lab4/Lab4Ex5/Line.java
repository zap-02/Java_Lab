package Lab4Ex5;

import Lab4Ex1.Point;
public class Line extends Shape implements Cloneable {
    private Point to;

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

    @Override
    public Object clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.to = this.to;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

