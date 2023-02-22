package komunikacja;

import java.io.*;

public class Autobus implements Komunikacja, Serializable {

    @Override
    public double obliczKoszt(double dystans) {
        double koszt = 0.2*dystans;
        return koszt;
    }

    @Override
    public int obliczPrzesiadki(double dystans) {
        int przesiadki=0;
        if(dystans>30&&dystans<60)
            przesiadki=1;
        if(dystans>60&&dystans<95)
            przesiadki=2;
        if(dystans>90)
            przesiadki=3;
        return przesiadki;
    }

    @Override
    public double obliczCzas(double dystans) {
        double czas = 1.3*dystans;
        return czas;
    }

}
