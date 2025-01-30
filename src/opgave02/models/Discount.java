package opgave02.models;

public class Discount {
    private String description;
    private int procentDiscount;
    private int fixedDiscount;
    private int minimumAmount;
    private DiscountType discountType;

    public Discount( String description, int procentDiscount, int fixedDiscount, int minimumAmount, DiscountType discountType) {
        this.description = description;
        this.procentDiscount = procentDiscount;
        this.fixedDiscount = fixedDiscount;
        this.minimumAmount = minimumAmount;
        this.discountType = discountType;
    }

    public String getDescription() {
        return description;
    }

    public double applyDiscount(double amount) {
        if (discountType == DiscountType.FIXED) {

            if (amount >= minimumAmount) {
                return fixedDiscount;
            } else {
                return 0;
            }
        } else if (discountType == DiscountType.PROCENT) {
            return amount * procentDiscount / 100;
        }
        throw new IllegalArgumentException("Unknown discount type");
    }
}
