package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("3","Alto","brass",InstrumentType.BRASS,500.00, 1000.00, 17);
    }

    @Test
    public void getModel() {
        assertEquals("3", saxophone.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Alto", saxophone.getBrand());
    }

    @Test
    public void getMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

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
//    public void getNumberOfValves() {
//        assertEquals();
//    }
}