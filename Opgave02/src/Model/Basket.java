package Model;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Book> items = new ArrayList<Book>();
    private ArrayList<Discount> discounts = new ArrayList<Discount>();
    private double total = 0;

    public void addItem(Book item) {
        total += item.getPrice();
        items.add(item);
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public double getTotal() {
        return total;
    }

    public void printTotal() {
        double totalDiscount = 0;
        for (Book book : items) {
            System.out.printf("%-60s %6.2f kr.\n", book.getTitle(), book.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------");
        for (Discount discount : discounts) {
            double discountAmount = discount.applyDiscount(this);
            System.out.printf("%-60s %6.2f kr.\n", discount.getDescription(), discountAmount);
            totalDiscount += discountAmount;
        }
        double discountedTotal = total + totalDiscount;
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-60s %5.2f kr.\n", "ialt: ", discountedTotal);
    }
}
