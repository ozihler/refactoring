package main.java.refactoringbook;

public class Movie {

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.price = Price.create(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

}
