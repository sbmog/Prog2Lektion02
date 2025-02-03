package opgave02.models;

public class FixedDiscount extends Discount {
    private int discount;
    private int minimumAmount;

    public FixedDiscount(String description, int discount, int minimumAmount) {
        super(description);
        this.discount = discount;
        this.minimumAmount = minimumAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount >= minimumAmount){
         return discount;
        }else {
            return 0;
        }
    }
}
