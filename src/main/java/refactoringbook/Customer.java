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
        Iterator<Rental> rentals = this.rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasNext()) {
            Rental rental = rentals.next();
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }

        //add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0;
        Iterator<Rental> rentals = this.rentals.iterator();
        while (rentals.hasNext()) {
            totalAmount += rentals.next().getCharge();
        }
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Iterator<Rental> rentals = this.rentals.iterator();
        while (rentals.hasNext()) {
            Rental rental = rentals.next();
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
