package opgave01.model;

public class Rektangel extends Figur {
    private double bredde;
    private double højde;

    public Rektangel(int x, int y, double bredde, double højde) {
        super(x, y);
        this.bredde = bredde;
        this.højde = højde;
    }

    @Override
    public double beregnAreal() {
        return bredde*højde;
    }

    @Override
    public String toString() {
        return "Rektangel med bredde " + bredde + " og højde " + højde + ", " + super.toString();
    }
}
