package main.java.refactoringbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    String name;
    List<Rental> rentals = new ArrayList<>();

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public void add(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentals = this.rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasNext()) {
            Rental rental = rentals.next();

            //add frequent renter points
            frequentRenterPoints++;
            //add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;

            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
            totalAmount+= rental.getCharge();
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned "+String.valueOf(frequentRenterPoints) +" frequent renter points";

        return result;
    }

}
