package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() {
        drumStick = new DrumStick("1","Yamaha",15.00,30.00);
    }

    @Test
    public void getModel() {
        assertEquals("1", drumStick.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", drumStick.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(15.00, drumStick.getBuyingPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(30.00, drumStick.getSellingPrice(),0.01);
    }
}