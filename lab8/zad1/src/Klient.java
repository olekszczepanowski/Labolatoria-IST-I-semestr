import java.util.Random;

public class Klient extends Osoba {

    Random random = new Random();
    private int n;
    private Lokata[] lokaty;


    public Klient(){
        super();
        lokaty=null;
    }

    public Klient(String nazwisko, String pesel, int n) {
        super(nazwisko, pesel);
        this.n = n;
        this.lokaty= StworzTabliceLokat();
    }
    public Lokata[] StworzTabliceLokat(){
        lokaty=new Lokata[n];
        for(int i = 0 ;i< lokaty.length;i++){
            lokaty[i]=new Lokata(random.nextInt(500, 10000),(double) Math.round(random.nextDouble(950001)+500)/100,
                    random.nextBoolean());
        }
        return lokaty;
    }

    @Override
    public double Oblicz() {
        double sumaLokat=0;
        for(int i = 0;i<lokaty.length;i++){
            sumaLokat+=lokaty[i].getKwota();
        }
        return sumaLokat;
    }

    @Override
    public String toString() {
        return "Klient: nazwisko: "+getNazwisko()+", PESEL: "+getPesel()+ ", [n+"+n+"]";
    }
    public void WyswietlLokaty(){
        StworzTabliceLokat();
        for(int i = 0;i< lokaty.length;i++){
            System.out.println(lokaty[i].toString());
        }
    }
}
