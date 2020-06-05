package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("1","Gibson","metal", InstrumentType.STRING, 300.00,500.00,7);
    }

    @Test
    public void getModel() {
        assertEquals("1", guitar.getModel());
    }
//
//
//
//    @Test
//    public void getBrand() {
//        assertEquals();
//    }
//
//    @Test
//    public void getMaterial() {
//        assertEquals();
//    }
//
//    @Test
//    public void getType() {
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
//
//    @Test
//    public void getNumberOfStrings() {
//        assertEquals();
//    }
}