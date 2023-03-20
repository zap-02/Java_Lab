package Lab2Ex7;

/**

 Класс, представляющий точку в двумерном пространстве с координатами x и y.
 */
public class Point1 {

    private final double x; // координата x
    private final double y; // координата y

    /**

     Конструктор, создающий точку с координатами (0, 0).
     */
    public Point1() {
        x = 0;
        y = 0;
    }
    /**

     Конструктор, создающий точку с заданными координатами x и y.
     @param x координата x точки
     @param y координата y точки
     */
    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**

     Возвращает координату x точки.
     @return координата x
     */
    public double getX(){
        return this.x;
    }
    /**

     Возвращает координату y точки.
     @return координата y
     */
    public double getY(){
        return this.y;
    }
    /**

     Возвращает новую точку, полученную смещением текущей точки на заданные значения shiftX и shiftY.
     @param shiftX смещение по оси x
     @param shiftY смещение по оси y
     @return новая точка с координатами (x + shiftX, y + shiftY)
     */
    public Point1 translate(double shiftX, double shiftY){
        return new Point1(this.x + shiftX, this.y + shiftY);
    }
    /**

     Возвращает новую точку, полученную масштабированием текущей точки на заданный коэффициент.
     @param mult коэффициент масштабирования
     @return новая точка с координатами (x * mult, y * mult)
     */
    public Point1 scale(double mult){
        return new Point1(this.x * mult, this.y * mult);
    }
}