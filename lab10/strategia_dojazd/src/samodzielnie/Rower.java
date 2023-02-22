package samodzielnie;

public class Rower implements Samodzielnie{
    @Override
    public double obliczCzas(double dystans) {
        double czas = 2.5*dystans;
        return czas;
    }

    @Override
    public double obliczKalorie(double dystans) {
        double kalorie = 6.5*dystans;
        return kalorie;
    }
}
