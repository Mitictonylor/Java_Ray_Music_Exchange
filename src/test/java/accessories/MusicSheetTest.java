package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicSheetTest {

    MusicSheet sheets;

    @Before
    public void setUp() {
        sheets = new MusicSheet("a3","papiro",1.00,3.00,100);
    }

    @Test
    public void getModel() {
        assertEquals("a3", sheets.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("papiro", sheets.getBrand());
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
//    public void getNumberOfSheets() {
//        assertEquals();
//    }
}