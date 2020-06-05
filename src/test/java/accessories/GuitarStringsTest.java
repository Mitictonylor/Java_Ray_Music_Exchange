package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("1","Gibson", 10.00, 25.00);
    }

    @Test
    public void getModel() {
        assertEquals("1", guitarStrings.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Gibson", guitarStrings.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(10.00, guitarStrings.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(25.00, guitarStrings.getSellingPrice(),0.01);
    }
}