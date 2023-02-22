package komunikacja;

import java.io.*;

public class Pociag implements Komunikacja, Serializable {
    @Override
    public double obliczKoszt(double dystans) {
        double koszt = 0.3*dystans;
        return koszt;
    }

    @Override
    public int obliczPrzesiadki(double dystans) {
        int przesiadki=0;
        if(dystans>80)
            przesiadki=1;
        return przesiadki;
    }

    @Override
    public double obliczCzas(double dystans) {
        double czas = 1.2*dystans;
        return czas;
    }
}
