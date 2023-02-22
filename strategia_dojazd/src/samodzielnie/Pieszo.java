package samodzielnie;

import java.io.*;
public class Pieszo implements Samodzielnie, Serializable {

    @Override
    public double obliczCzas(double dystans) {
        double czas = 8*dystans;
        return czas;
    }

    @Override
    public double obliczKalorie(double dystans) {
        double kalorie =13*dystans;
        return kalorie;
    }
}
