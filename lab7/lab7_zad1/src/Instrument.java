public abstract class Instrument {
    private String nazwa;
    public Instrument(){
        nazwa="";
    }

    public Instrument(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Instrument o nazwie: "+nazwa;
    }

    public abstract String wydajDzwiek();


    public abstract void graj();

    public String getNazwa() {
        return nazwa;
    }


    public abstract int getIlosc();
}
