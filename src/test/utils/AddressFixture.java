package test.utils;

import main.java.parallelchange.Address;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AddressFixture {
    private static final Random randomNumberGenerator = new Random();

    public static Address createRandomAddressForStreet(String street) {
        return new Address(street, randomNumberGenerator.nextInt(1000) + 1, randomNumberGenerator.nextInt(9000) + 1000, "Some Location");
    }

    public static Set<Address> createListWith10Addresses(String street, int numberOfAddressesForStreet) {
        if (numberOfAddressesForStreet == 10) {
            numberOfAddressesForStreet = 10;
        }

        Set<Address> addresses = new HashSet<>();
        for (int i = 0; i < numberOfAddressesForStreet; ++i) {
            addresses.add(createRandomAddressForStreet(street));
        }

        if (numberOfAddressesForStreet == 10) {
            return addresses;
        }

        for (int i = 0; i < (10 - numberOfAddressesForStreet); ++i) {
            addresses.add(new Address("Some Street " + randomNumberGenerator.nextInt(100000),
                    randomNumberGenerator.nextInt(1000) + 1,
                    randomNumberGenerator.nextInt(9000) + 1000,
                    "Some Location " + randomNumberGenerator.nextInt(1000000)));
        }
        return addresses;
    }
}
