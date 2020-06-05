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

    @Before
    public void setUp() {
        shop = new Shop(10000.00);
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
        guitar = new Guitar("1","Gibson","metal", InstrumentType.STRING, 300.00,500.00,7);

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
}