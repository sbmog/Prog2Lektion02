package opgave01.model;

public class Kvadrat extends Figur {
    private double side;

    public Kvadrat(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double beregnAreal() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Kvadrat med side " + side + ", " + super.toString();
    }
}
