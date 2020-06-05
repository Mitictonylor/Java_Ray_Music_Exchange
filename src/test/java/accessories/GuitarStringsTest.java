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

//    @Test
//    public void getBrand() {
//        assertEquals();
//    }
//
//    @Test
//    public void getBuyingPrice() {
//        assertEquals();
//    }
//
//    @Test
//    public void getSellingPrice() {
//        assertEquals();
//    }
}