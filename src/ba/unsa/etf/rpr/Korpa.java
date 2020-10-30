package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] niz = new Artikl[50];
    private int brojac = 0;

    public boolean dodajArtikl(Artikl a) {
        if (brojac>49) return false;
        niz[brojac++] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
        return true;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojac; i++)
            if (niz[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(niz[i].getNaziv(), niz[i].getCijena(), niz[i].getKod());
                for (int k = i; k < brojac; k++) {
                    niz[k] = niz[k + 1];
                }
                brojac--;
                return temp;
            }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for (int i=0;i<brojac;i++) {
            suma = suma + niz[i].getCijena();
        }
        return suma;
    }
}
