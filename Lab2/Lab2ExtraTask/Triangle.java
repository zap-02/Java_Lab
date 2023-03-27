package Lab2ExtraTask;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        return ab + bc + ca;
    }

    public double getArea() {
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        double s = (ab + bc + ca) / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    public Point getBisectorIntersection() {
        double kAB = (b.getY() - a.getY()) / (b.getX() - a.getX());
        double kAD = (c.getY() - a.getY()) / (c.getX() - a.getX());
        double k1 = -1 / kAB;
        double k2 = -1 / kAD;

        double x = (k1 * a.getX() - k2 * c.getX() + c.getY() - a.getY()) / (k1 - k2);
        double y = k1 * (x - a.getX()) + a.getY();

        return new Point(x, y);
    }
}
