package opgave02.models;

public class ProcentDiscount extends Discount {
    private int procent;

    public ProcentDiscount(String description, int procent) {
        super(description);
        this.procent = procent;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * procent / 100;
    }
}
