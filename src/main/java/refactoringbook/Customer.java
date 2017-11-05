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

    public String getName() {
        return name;
    }

    public String statement(){
        return "";
    }
}
