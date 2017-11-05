package main.java.refactoringbook;

public abstract class Price {

    protected int priceCode;

    Price(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public abstract double getCharge(int daysRented);

    public boolean isNewRelease() {
        return priceCode == PriceFactory.NEW_RELEASE;
    }
}
