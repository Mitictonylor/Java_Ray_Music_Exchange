package people;

import People.Customer;
import People.Shop;
import People.Wholesale;
import accessories.DrumStick;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WholesaleTest {

    Shop shop;
    ISell drumStick;
    ISell guitar;
    Wholesale wholesale;

    @Before
    public void setUp() {
        shop = new Shop(10000.00);
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
        guitar = new Guitar("1","Gibson","metal", InstrumentType.STRING, 300.00,500.00,7);
        wholesale = new Wholesale(300000);
        wholesale.addToStock(drumStick);

    }

    @Test
    public void stockStartsWith1() {
        assertEquals(1,wholesale.countStock());
    }


    @Test
    public void canRemoveFromStock() {
        wholesale.removeFromStock(drumStick);
        assertEquals(0, wholesale.countStock());
    }
    @Test
    public void canNotRemoveFromStock__productIsNotInTheStock() {
        assertEquals(1, wholesale.countStock());
        wholesale.removeFromStock(guitar);
        assertEquals(1, wholesale.countStock());
    }


    @Test
    public void canSellAnItem() {
        assertEquals(1, wholesale.countStock());
        wholesale.addToStock(guitar);
        assertEquals(2, wholesale.countStock());
        assertEquals(0, shop.countStock());
        assertEquals(300000, wholesale.getTill(), 0.01);
        wholesale.sell(guitar,shop);
        assertEquals(1, wholesale.countStock());
        assertEquals(9700.00, shop.getTill(),0.01);
        assertEquals(300300,  wholesale.getTill(),0.01);
        assertEquals(1, shop.countStock());

    }
}