package main.java.refactoringbook;

public class Price {
    private int priceCode;

    public Price(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public double getCharge(int daysRented) {
        double thisAmount = 0;
        //determine amount for each line
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}
