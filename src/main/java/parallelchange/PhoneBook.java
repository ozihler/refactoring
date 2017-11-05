package main.java.parallelchange;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private Set<Address> addressRepository;

    public PhoneBook(Set<Address> addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void add(Address address) {
        addressRepository.add(address);
    }


    public int getNumberOfEntries() {
        return addressRepository.size();
    }

    public Set<Address> findAddressesInStreet(String street) {
        Set<Address> addresses = new HashSet<>();

        for (Address address : addressRepository) {
            if (address.getStreet().equalsIgnoreCase(street)) {
                addresses.add(address);
            }
        }

        return addresses;
    }
}
