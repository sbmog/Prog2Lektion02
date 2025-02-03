package opgave01.model;

public abstract class Figur {
    protected int x;
    protected int y;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double beregnAreal();

    public void parallelForskyd(int dx, int dy) {
        this.x = dx;
        this.y = dy;
    }

    @Override
    public String toString() {
        return "Placering: (" + x + ", " + y + ")";
    }
}
