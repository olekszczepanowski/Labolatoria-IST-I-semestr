public class KartaSeniora extends KartaKlienta{
    public KartaSeniora() {
        super();
    }

    public KartaSeniora(int numer, String nazwisko) {
        super(numer, nazwisko);
    }

    @Override
    public double rabat() {
        return 0.15;
    }
}
