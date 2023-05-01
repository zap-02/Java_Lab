package Lab4Ex5;

import Lab4Ex1.Point;

abstract class Shape {
    protected Point point;
    public Shape(Point point) {
        this.point = point;
    }
    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }
    public abstract Point getCenter();
}
