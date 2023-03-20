package Lab2Ex7;

/**
 * Класс Point представляет собой точку в двумерном пространстве с координатами x и y.
 */
public class Point2 {

    /** Координата x точки */
    private double x;

    /** Координата y точки */
    private double y;

    /**
     * Создает новую точку с координатами (0, 0).
     */
    public Point2() {
        x = 0;
        y = 0;
    }

    /**
     * Создает новую точку с заданными координатами.
     * @param x координата x новой точки
     * @param y координата y новой точки
     */
    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату x точки.
     * @return координата x
     */
    public double getX(){
        return this.x;
    }

    /**
     * Возвращает координату y точки.
     * @return координата y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Сдвигает точку на заданные значения по осям x и y.
     * @param shiftX сдвиг по оси x
     * @param shiftY сдвиг по оси y
     */
    public void translate(double shiftX, double shiftY){
        this.x += shiftX;
        this.y += shiftY;
    }

    /**
     * Масштабирует точку на заданный коэффициент.
     * @param mult коэффициент масштабирования
     */
    public void scale(double mult){
        this.x *= mult;
        this.y *= mult;
    }
}
