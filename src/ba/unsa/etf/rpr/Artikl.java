
package ba.unsa.etf.rpr;

public class Artikl {
    int cijena;
    String ime,kod;


    public Artikl(String ime, int cijena, String kod) {
        this.cijena = cijena;
        this.ime = ime;
        this.kod = kod;
    }

    public String getNaziv() {
        return ime;
    }
    public String getKod() {
        return kod;
    }
    public int getCijena() {
        return cijena;
    }
}
