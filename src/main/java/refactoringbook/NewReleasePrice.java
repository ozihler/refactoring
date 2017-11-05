package main.java.refactoringbook;

public class NewReleasePrice extends Price {
    public NewReleasePrice(int priceCode) {
        super(priceCode);
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3d;
    }
}
