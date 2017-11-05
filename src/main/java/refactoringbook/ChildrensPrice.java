package main.java.refactoringbook;

public class ChildrensPrice extends Price {
    public ChildrensPrice(int priceCode) {
        super(priceCode);
    }

    @Override
    public double getCharge(int daysRented) {
        if (daysRented > 3) {
            return (daysRented * 1.5) - 3;
        }
        return 1.5;
    }
}
