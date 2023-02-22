public class InstrumentDety extends Instrument {
    private int lt;


    public InstrumentDety(){
        super("ZlotaTrabka");
        lt=1;
    }


    public InstrumentDety(String nazwa, int a) {
        super(nazwa);
        this.lt = a;
    }



    @Override
    public String wydajDzwiek() {
        String dzwiek = "Tra ta ta";
        return dzwiek;
    }

    public int getIlosc() {
        return lt;
    }

    @Override
    public void graj() {
        for (int i = 0; i < lt; i++)
            System.out.println(wydajDzwiek());
    }

    @Override
    public String toString() {
        return "Instrument dety: " +getNazwa()+"[lt="+lt+"]";
    }
}
