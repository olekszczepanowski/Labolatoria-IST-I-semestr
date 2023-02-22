public class Transakcja {

    private static int numerTransakcji;

    private int numer;
    private double kwota;
    private KartaKlienta karta;


    public KartaKlienta getKarta() {
        return karta;
    }

    public Transakcja(double kwota, KartaKlienta karta) {
        this.kwota = kwota;
        this.karta = karta;
        this.numerTransakcji++;
        this.numer=numerTransakcji;
    }
    public Transakcja(){
        karta=null;
        kwota=0;
        numerTransakcji++;
        numer=numerTransakcji;
    }
    public double kwotaDoZaplaty(){
        double kwotaDoZaplaty=kwota-kwota*karta.rabat();
        return kwotaDoZaplaty;
    }

    @Override
    public String toString() {
        return "Transakcja numer: " +numer+
                " kwota: " + kwota +
                " karta: " + karta ;


    }
}
