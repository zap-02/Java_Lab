package Lab2Ex6;

public class Point {

    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void translate(double shiftX, double shiftY){
        this.x += shiftX;
        this.y += shiftY;
    }

    public void scale(double mult){
        this.x *= mult;
        this.y *= mult;
    }


}
