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
        StraightLine ab = new StraightLine(a, b);
        ab.print();
        StraightLine ac = new StraightLine(a, c);
        ac.print();
        StraightLine bc = new StraightLine(b, c);
        bc.print();
        StraightLine bisA = getInnerBisectorLine(ab, ac, b, c);
        StraightLine bisB = getInnerBisectorLine(bc, ab, a, c);
        double x = (-bisB.getKoefC() + bisB.getKoefB()*bisA.getKoefC())/(bisB.getKoefA() - bisB.getKoefB()*bisA.getKoefA());
        double y = -bisA.getKoefA()*x - bisA.getKoefC();
        return new Point(x, y);
    }
    public StraightLine getInnerBisectorLine(StraightLine a, StraightLine b, Point pointA, Point pointB){
        double k1 = Math.sqrt(Math.pow(a.getKoefA(), 2) + Math.pow(a.getKoefB(), 2));
        double k2 = Math.sqrt(Math.pow(b.getKoefA(), 2) + Math.pow(b.getKoefB(), 2));
        double koefA1 = k2*a.getKoefA() - k1*b.getKoefA();
        double koefB1 = k2*a.getKoefB() - k1*b.getKoefB();
        double koefC1 = k2 - k1;
        double koefA2 = k2*a.getKoefA() + k1*b.getKoefA();
        double koefB2 = k2*a.getKoefB() + k1*b.getKoefB();
        double koefC2 = k2 + k1;
        if(isDifferent(koefA1*pointA.getX() + koefB1*pointA.getY() + koefC1, koefA1*pointB.getX() + koefB1*pointB.getY() + koefC1) ){
            return new StraightLine(koefA1, koefB1, koefC1);
        }
        else return new StraightLine(koefA2, koefB2, koefC2);
    }
    public boolean isDifferent(double a, double b){
        return a > 0 && b < 0 || a < 0 && b > 0;
    }
}
