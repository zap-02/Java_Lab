import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label + ": (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof LabeledPoint)) return false;
        LabeledPoint lp = (LabeledPoint) o;
        return Objects.equals(label, lp.label);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(label);
    }


        public static void main(String[] args) {
            Point point = new Point(1.0, 2.0);
            LabeledPoint labeledPoint = new LabeledPoint("A", 3.0, 4.0);
            System.out.println(point.x); // переменная x не видна и значения не выводяться
            System.out.println(labeledPoint.x); // работает: выводит значение x из экземпляра LabeledPoint
        }

}
