package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("2","Yamaha","wood",InstrumentType.KEYBOARD, 1000,2500,8)
    }

    @Test
    public void getModel() {
        assertEquals("2", piano.getModel());
    }
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
//    public void getOctaveNumber() {
//        assertEquals();
//    }
}