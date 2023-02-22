public class KartaPodstawowa extends KartaKlienta{
    public KartaPodstawowa() {
        super();
    }

    public KartaPodstawowa(int numer, String nazwisko) {
        super(numer, nazwisko);
    }

    @Override
    public double rabat() {
        return 0;
    }

}

