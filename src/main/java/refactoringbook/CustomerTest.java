package main.java.refactoringbook;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void test() {
        List<Movie> movies = Arrays.asList(new Movie("Pulp Fiction", PriceFactory.create(2)),
                new Movie("Independence Day", PriceFactory.create(1)),
                new Movie("Spider Man", PriceFactory.create(0)),
                new Movie("Thor", PriceFactory.create(2)),
                new Movie("Avengers 2", PriceFactory.create(1)),
                new Movie("Avengers 1", PriceFactory.create(2)),
                new Movie("Newly Weds", PriceFactory.create(2)),
                new Movie("No country for old man", PriceFactory.create(0)));

        List<Rental> rentals = new ArrayList<>();
        for (Movie movie : movies) {
            rentals.add(new Rental(movie, 10));
        }

        Customer customer = new Customer("Customer1", rentals);
        customer.add(new Rental(new Movie("Independence Day 2", PriceFactory.create(2)), 12));

        assertEquals("Rental Record for Customer1\n" +
                "\tPulp Fiction\t12.0\n" +
                "\tIndependence Day\t30.0\n" +
                "\tSpider Man\t14.0\n" +
                "\tThor\t12.0\n" +
                "\tAvengers 2\t30.0\n" +
                "\tAvengers 1\t12.0\n" +
                "\tNewly Weds\t12.0\n" +
                "\tNo country for old man\t14.0\n" +
                "\tIndependence Day 2\t15.0\n" +
                "Amount owed is 151.0\n" +
                "You earned 11 frequent renter points", customer.statement());
    }
}