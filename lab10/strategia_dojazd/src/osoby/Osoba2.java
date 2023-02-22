package osoby;

import komunikacja.Autobus;
import samodzielnie.Rower;

public class Osoba2 extends Trasa {
    public Osoba2(){
        komunikacja = new Autobus();
        setAlgorytmInfoKomunikacja("autobusem.");
        samodzielnie = new Rower();
        setAlgorytmInfoSamodzielnie("jedzie rowerem");

    }

    @Override
    public void wyswietlInfo() {
        if(komunikacja!=null)
            System.out.println("Osoba 2 jedzie "+getAlgorytmInfoKomunikacja());
        if(samodzielnie!=null)
            System.out.println("Osoba 2 "+getAlgorytmInfoSamodzielnie());
        System.out.println();
    }
}

