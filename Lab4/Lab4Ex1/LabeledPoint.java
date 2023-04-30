package Lab4Ex1;

public class LabeledPoint extends Point{
    private final String label;
    LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}
