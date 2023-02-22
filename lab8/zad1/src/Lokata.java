public class Lokata {
    private int nrLokaty;
    private double kwota;
    private boolean czyZerwanaPrzedTerminem;

    public Lokata(){
        nrLokaty=0;
        kwota=0;
        czyZerwanaPrzedTerminem=false;
    }
    public Lokata(int nrLokaty, double kwota, boolean czyZerwanaPrzedTerminem) {
        this.nrLokaty = nrLokaty;
        this.kwota = kwota;
        this.czyZerwanaPrzedTerminem = czyZerwanaPrzedTerminem;
    }

    public double getKwota() {
        return kwota;
    }

    @Override
    public String toString() {
        return "nrLokaty=" + nrLokaty +
                ", kwota=" + kwota +
                ", czyZerwanaPrzedTerminem=" + czyZerwanaPrzedTerminem;
    }
}
