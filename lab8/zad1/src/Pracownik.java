import java.util.Arrays;
import java.util.Random;

public class Pracownik extends Osoba{
    Random random = new Random();
    private String stanowisko;
    private int pensja;
    private int stawka;
    private int[] t = new int[6];

    private int iloscNadgodzin;

    public Pracownik(){
        super();
        stanowisko="brak";
        pensja=0;
        stawka=0;
        t=null;

    }

    public Pracownik(String nazwisko, String pesel, String stanowisko, int pensja, int stawka) {
        super(nazwisko, pesel);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
        this.stawka = stawka;
        for(int i = 0;i<t.length;i++){
            t[i]= random.nextInt(0,4);
            iloscNadgodzin+=t[i];
        }

    }

    @Override
    public double Oblicz() {
        double wartoscPracownika;
        wartoscPracownika=pensja+stawka*iloscNadgodzin;
        return wartoscPracownika;
    }

    @Override
    public String toString() {
        return "Pracownik: nazwisko: "+getNazwisko()+", PESEL: "+getPesel()+
                ", stanowisko: "+stanowisko+", pensja= " +pensja+", stawka= "+stawka;
    }

    public int getIloscNadgodzin() {
        return iloscNadgodzin;
    }

    public boolean jestKasjerem(){
        boolean jestKasjerem;
        if(stanowisko.equals("Kasjer"))
            jestKasjerem=true;
        else jestKasjerem=false;
        return jestKasjerem;
    }

    public String getStanowisko() {
        return stanowisko;
    }
}
