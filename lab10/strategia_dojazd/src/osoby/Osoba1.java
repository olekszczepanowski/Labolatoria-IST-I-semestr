package osoby;

import komunikacja.Pociag;
import samodzielnie.Pieszo;

public class Osoba1 extends Trasa{
    public Osoba1(){
        komunikacja = new Pociag();
        setAlgorytmInfoKomunikacja("pociagiem.");
        samodzielnie = new Pieszo();
        setAlgorytmInfoSamodzielnie("idzie pieszo.");
    }

    @Override
    public void wyswietlInfo() {
        if(komunikacja!=null)
        System.out.println("Osoba 1 jedzie "+getAlgorytmInfoKomunikacja());
        if(samodzielnie!=null)
        System.out.println("Osoba 1 "+getAlgorytmInfoSamodzielnie());
        System.out.println();
    }
}
