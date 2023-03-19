package Lab2Ex5;

public class Point {

    private final double x;
    private final double y;

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

    public Point translate(double shiftX, double shiftY){
//        Lab2Ex5.Point p = new Lab2Ex5.Point(this.x + shiftX, this.y + shiftY);
//        return p;
        return new Point(this.x + shiftX, this.y + shiftY);
    }

    public Point scale(double mult){

        return new Point(this.x * mult, this.y * mult);
    }


}
