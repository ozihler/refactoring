package main.java.refactoringbook;

public class RegularPrice extends Price {
    public RegularPrice(int priceCode) {
        super(priceCode);
    }

    @Override
    public double getCharge(int daysRented) {
        if (daysRented > 2) {
            return 1.5 * daysRented - 1;
        }
        return 2d;
    }
}
