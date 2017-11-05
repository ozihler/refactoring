package main.java.refactoringbook;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getFrequentRenterPoints() {
        if (movie.isNewRelease() && daysRented > 1) {
            return 2;
        }
        return 1;
    }

    public double getRentalCharge() {
        return movie.getCharge(daysRented);
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }
}
