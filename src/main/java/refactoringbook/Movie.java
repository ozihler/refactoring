package main.java.refactoringbook;

public class Movie {

    private String title;
    private Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public boolean isNewRelease() {
        return price.isNewRelease();
    }
}
