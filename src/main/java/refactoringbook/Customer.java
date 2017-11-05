package main.java.refactoringbook;

import java.util.ArrayList;
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

    public String statement() {
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : this.rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.movie.getCharge(rental.getDaysRented()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    public String htmlStatement() {
        String result = "<h1>Rentals for <EM>" + name + "</EM></h1><p>\n";
        for (Rental rental : rentals) {
            result += rental.getMovie().getTitle() + ":" + rental.movie.getCharge(rental.getDaysRented()) + "<br/>\n";
        }
        //add footer lines
        result += "<p>Amount owed is " + getTotalAmount() + "</p>\n";
        result += "<p>You earned " + getFrequentRenterPoints() + " frequent renter points</p>";
        return result;
    }

    private double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.movie.getCharge(rental.getDaysRented());
        }
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
