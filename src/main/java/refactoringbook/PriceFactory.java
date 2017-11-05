package main.java.refactoringbook;

import main.java.refactoringbook.ChildrensPrice;
import main.java.refactoringbook.NewReleasePrice;
import main.java.refactoringbook.Price;
import main.java.refactoringbook.RegularPrice;

public class PriceFactory {
    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

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
}
