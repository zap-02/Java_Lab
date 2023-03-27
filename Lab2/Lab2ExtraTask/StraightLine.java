package Lab2ExtraTask;

public class StraightLine {
    private final double koefA;
    private final double koefB;
    private final double koefC;
    StraightLine(Point a, Point b){
        koefA = a.getY() - b.getY();
        koefB = b.getX() - a.getX();
        koefC = a.getX()*(b.getY() - a.getY()) - a.getY()*(b.getX() - a.getX());
    }
    StraightLine(double a, double b, double c){
        koefA = a;
        koefB = b;
        koefC = c;
    }

    public double getKoefA() {
        return koefA;
    }

    public double getKoefB() {
        return koefB;
    }

    public double getKoefC() {
        return koefC;
    }
    public void print(){
        System.out.println(koefA + "x + "+ koefB + "y + " + koefC + " = 0");
    }
}
