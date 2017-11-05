package test.java.parallelchange;

import main.java.parallelchange.Address;
import main.java.parallelchange.PhoneBook;
import org.junit.Test;
import test.utils.AddressFixture;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void getNumberOfEntries_emptyAddressList_noEntries() {
        PhoneBook phoneBook = new PhoneBook(new HashSet<>());
        assertEquals(0, phoneBook.getNumberOfEntries());
    }

    @Test
    public void add_oneEntry_getNumberOfEntries1() {
        PhoneBook phoneBook = new PhoneBook(new HashSet<>());
        Address address = AddressFixture.createRandomAddressForStreet("Patternstreet");
        phoneBook.add(address);
        assertEquals(1, phoneBook.getNumberOfEntries());
    }

    @Test
    public void findAddressesInStreet_noInputStreet_returnsEmptyList() {
        Set<Address> addresses = AddressFixture.createListWith10Addresses("Patternstreet", 4);
        PhoneBook phoneBook = new PhoneBook(addresses);

        assertEquals(4, phoneBook.findAddressesInStreet("Patternstreet").size());
    }

}