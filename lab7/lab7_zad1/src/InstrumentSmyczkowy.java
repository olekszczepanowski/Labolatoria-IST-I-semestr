public class InstrumentSmyczkowy extends Instrument {

    private int ls;


    public InstrumentSmyczkowy() {
        super("Stradivarius");
        ls=1;
    }


    public InstrumentSmyczkowy(String nazwa, int a) {
        super(nazwa);
        this.ls = a;
    }

    public boolean jestKontrabasem() {
        boolean jestKontrabasem;
        if (getNazwa().equals("Kontrabas"))
            jestKontrabasem = true;
        else
            jestKontrabasem = false;
        return jestKontrabasem;
    }


    @Override
    public String wydajDzwiek() {
        String dzwiek = "Smyk smyk smyk";
        return dzwiek;
    }

    @Override
    public void graj() {
        for (int i = 0; i < ls; i++)
            System.out.println(wydajDzwiek());
    }

    public int getIlosc() {
        return ls;
    }

    @Override
    public String toString() {
        return "Instrument smyczkowy: " + getNazwa() + "[lt=" + ls + "]";
    }
}

