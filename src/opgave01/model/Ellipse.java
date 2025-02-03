package opgave01.model;

public class Ellipse extends Figur {
    private double radius1;
    private double radius2;

    public Ellipse(int x, int y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public String toString() {
        return "Ellipse med radius1 " + radius1 + " og radius2 " + radius2 + ", " + super.toString();
    }
}
