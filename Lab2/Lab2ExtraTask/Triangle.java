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
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));

        StraightLine bisC = getInnerBisectorLine(this.a, this.b, this.c);
        StraightLine bisA = getInnerBisectorLine(this.c, this.b, this.a);
        bisC.set();
        bisA.set();
        bisC.print();
        bisA.print();
        double x = (bisA.getKoefC() - bisC.getKoefC())/ (bisC.getKoefA() - bisA.getKoefA());
        double y = bisC.getKoefA()*x + bisC.getKoefC();
        return new Point(x, y);
    }
    public StraightLine getInnerBisectorLine(Point pointA, Point pointB, Point pointC){
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        double n = ca/bc;
        Point pointF = new Point((pointA.getX() + pointB.getX()*n)/(1 + n), (pointA.getY() + pointB.getY()*n)/(1 + n));
        return new StraightLine(pointC, pointF);
    }

}
