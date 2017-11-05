package main.java.refactoringbook;

public abstract class Price {
    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    protected int priceCode;

    Price(int priceCode) {
        this.priceCode = priceCode;
    }

    public static Price create(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                return new RegularPrice(priceCode);
            case NEW_RELEASE:
                return new NewReleasePrice(priceCode);
            case CHILDRENS:
                return new ChildrensPrice(priceCode);
            default:
        }
        throw new RuntimeException("Not supported:" + priceCode);
    }

    public int getPriceCode() {
        return priceCode;
    }

    public abstract double getCharge(int daysRented);
}
