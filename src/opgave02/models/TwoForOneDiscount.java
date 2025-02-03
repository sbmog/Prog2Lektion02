package opgave02.models;

import java.util.ArrayList;
import java.util.Comparator;

public class TwoForOneDiscount extends Discount {

    public TwoForOneDiscount() {
        super("2-for-1, få den billigste gratis");
    }

    @Override
    public double applyDiscount(double amount) {
        return 0;
    }

    public double applyDiscount(Basket basket) {
        ArrayList<Book> books = basket.getItems();

        if (books.size() < 2) {
            return 0;
        }

        books.sort(Comparator.comparingDouble(Book::getPrice));

        int freeBooks = books.size() / 2;
        double discount = 0;

        for (int index = 0; index < freeBooks; index++) {
            discount-=books.get(index).getPrice();
        }
        return discount;
    }
}
