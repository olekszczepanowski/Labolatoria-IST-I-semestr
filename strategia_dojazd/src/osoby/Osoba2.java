package osoby;

import komunikacja.Autobus;
import samodzielnie.Rower;

import java.io.*;

public class Osoba2 extends Trasa implements Serializable {
    public Osoba2(){
        this.komunikacja = new Autobus();
        setAlgorytmInfoKomunikacja("autobusem.");
        this.samodzielnie = new Rower();
        setAlgorytmInfoSamodzielnie("jedzie rowerem");

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

