package people;

import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;


    @Before
    public void setUp() {
        customer = new Customer("Fra", 10000.0);
    }


    @Test
    public void getName() {
        assertEquals("Fra", customer.getName());
    }


//
//    @Test
//    public void getWallet() {
//        assertEquals();
//    }
//
//    @Test
//    public void countMyMusicStuff() {
//        assertEquals();
//    }
}