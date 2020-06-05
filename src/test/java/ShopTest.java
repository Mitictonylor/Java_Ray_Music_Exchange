import accessories.DrumStick;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell drumStick;

    @Before
    public void setUp() {
        shop = new Shop();
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
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
        shop.addToStock(drumStick);
        assertEquals(1, shop.countStock());
        shop.removeFromStock(drumStick);
        assertEquals(0, shop.countStock());
    }
}