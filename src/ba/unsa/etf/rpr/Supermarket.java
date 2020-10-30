package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] niz = new Artikl[1000];
    int brojac = 0;

    public boolean dodajArtikl(Artikl a) {
        if (brojac>49) {
            System.out.println("Previse artikala");
            return false;
        }
        niz[brojac++] = a;
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


}
