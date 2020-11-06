package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl a = new Artikl("biciklo", 2, "kod");
        supermarket.dodajArtikl(a);
        assertEquals(2, supermarket.niz[0].getCijena());
    }
}