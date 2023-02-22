package osoby;

import komunikacja.Pociag;
import samodzielnie.Pieszo;

import java.io.*;

public class Osoba1 extends Trasa implements Serializable {
    public Osoba1(){
        this.komunikacja = new Pociag();
        setAlgorytmInfoKomunikacja("pociagiem.");
        this.samodzielnie = new Pieszo();
        setAlgorytmInfoSamodzielnie("idzie pieszo.");
    }

    @Override
    public void wyswietlInfo() {
        if(komunikacja!=null)
        System.out.println("Osoba jedzie "+getAlgorytmInfoKomunikacja());
        if(samodzielnie!=null)
        System.out.println("Osoba "+getAlgorytmInfoSamodzielnie());
        System.out.println();
    }

}
