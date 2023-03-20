/**

 Класс, представляющий точку в двумерном пространстве с координатами x и y.
 */
public class Point {

    private final double x; // координата x
    private final double y; // координата y

    /**

     Конструктор, создающий точку с координатами (0, 0).
     */
    public Point() {
        x = 0;
        y = 0;
    }
    /**

     Конструктор, создающий точку с заданными координатами x и y.
     @param x координата x точки
     @param y координата y точки
     */
    public Point(double x, double y) {
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
    public Point translate(double shiftX, double shiftY){
        return new Point(this.x + shiftX, this.y + shiftY);
    }
    /**

     Возвращает новую точку, полученную масштабированием текущей точки на заданный коэффициент.
     @param mult коэффициент масштабирования
     @return новая точка с координатами (x * mult, y * mult)
     */
    public Point scale(double mult){
        return new Point(this.x * mult, this.y * mult);
    }
}