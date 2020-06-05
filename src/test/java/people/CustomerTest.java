package people;

import People.Customer;
import accessories.DrumStick;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    Customer customer;
    ISell drumStick;
    ISell guitar;


    @Before
    public void setUp() {
        customer = new Customer("Fra", 10000.0);
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
        guitar = new Guitar("1","Gibson","metal", InstrumentType.STRING, 300.00,500.00,7);

    }


    @Test
    public void getName() {
        assertEquals("Fra", customer.getName());
    }



    @Test
    public void getWallet() {
        assertEquals(10000.00, customer.getWallet(),0.01);
    }

    @Test
    public void countMyMusicStuff() {
        assertEquals(0, customer.countMyMusicStuff());
    }
    @Test
    public void canAddStuffInMyMusicStuff() {
        assertEquals(0, customer.countMyMusicStuff());
        customer.addToMusicStuff(guitar);
        assertEquals(1, customer.countMyMusicStuff());
    }

    @Test
    public void hasEnoughMoneyToBuyGuitar(){
        assertTrue(customer.enoughMoney(guitar));
    }

}