package opgave01.model;

public class Cirkel extends Figur {
    private double radius;

    public Cirkel(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cirkel med radius " + radius + ", " + super.toString();
    }
}
