package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArtiklTest {
    @Test
    void getKod() {
        Artikl atemp = new Artikl("romobil", 25 , "brzi");
        String kod = atemp.getKod();
        assertEquals("brzi", kod);
    }
}
