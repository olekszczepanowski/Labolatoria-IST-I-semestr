public abstract class Osoba {
    private String nazwisko;
    private String pesel;
    public Osoba(){
        nazwisko="";
        pesel="";
    }

    public Osoba(String nazwisko, String pesel) {
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Osoba" +
                " nazwisko: " + nazwisko + " pesel:" + pesel;
    }
    public abstract double Oblicz();

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }


}

