package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("biciklo",50,"id");
        Artikl b = new Artikl("romobil",20,"id");
        Artikl c = new Artikl("Kacket", 15, "id");
        korpa.dodajArtikl(a);
        korpa.dodajArtikl(b);
        korpa.dodajArtikl(c);
        double cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(85,cijena);
    }
}