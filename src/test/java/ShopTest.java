import People.Customer;
import People.Shop;
import accessories.DrumStick;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell drumStick;
    ISell guitar;
    Customer customer;

    @Before
    public void setUp() {
        shop = new Shop(10000.00);
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
        guitar = new Guitar("1","Gibson","metal", InstrumentType.STRING, 300.00,500.00,7);
        customer = new Customer("fra", 900.00);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0,shop.countStock());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveFromStock() {
        assertEquals(0, shop.countStock());
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
        shop.removeFromStock(drumStick);
        assertEquals(0, shop.countStock());
    }
    @Test
    public void canNotRemoveFromStock__productIsNotInTheStock() {
        assertEquals(0, shop.countStock());
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
        shop.removeFromStock(guitar);
        assertEquals(1, shop.countStock());
    }


    @Test
    public void canCalculateTotalMarkupOfTheStock() {
        assertEquals(0, shop.countStock());
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
        shop.addToStock(guitar);
        assertEquals(2, shop.countStock());
        assertEquals(215.00, shop.totalMarkup(),0.01);

    }

    @Test
    public void canSellAnItem() {
        assertEquals(0, shop.countStock());
        assertEquals(10000.00, shop.getTill(),0.01);
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
        shop.addToStock(guitar);
        assertEquals(2, shop.countStock());
        assertEquals(0, customer.countMyMusicStuff());
        shop.sell(guitar,customer);
        assertEquals(1, shop.countStock());
        assertEquals(10500.00, shop.getTill(),0.01);
        assertEquals(400, customer.getWallet(),0.01);
        assertEquals(1, customer.countMyMusicStuff());

    }
}