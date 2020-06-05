import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0,shop.countStock());
    }
}