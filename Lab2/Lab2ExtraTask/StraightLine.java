package Lab2ExtraTask;

public class StraightLine {
    private double koefA;
    private double koefB;
    private double koefC;
    StraightLine(Point a, Point b){
        koefA = (a.getY() - b.getY());
        koefB = (b.getX() - a.getX());
        koefC = (a.getX()*(b.getY() - a.getY()) - a.getY()*(b.getX() - a.getX()));
    }

    public double getKoefA() {
        return koefA;
    }

    public double getKoefC() {
        return koefC;
    }
    public void print(){
        System.out.println("y = "+koefA+"x + " +koefC);
    }
    public void set(){
        double newA = -koefA/koefB;
        double newC = -koefC/koefB;
        koefA = newA;
        koefC = newC;
        koefB = 1;
    }
}
