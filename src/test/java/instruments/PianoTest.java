package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("2","Yamaha","wood",InstrumentType.KEYBOARD, 1000,2500,8);
    }

    @Test
    public void getModel() {
        assertEquals("2", piano.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1000.00, piano.getBuyingPrice(),0.01);
    }

//    @Test
//    public void getSellingPrice() {
//        assertEquals();
//    }
//
//    @Test
//    public void getOctaveNumber() {
//        assertEquals();
//    }
}