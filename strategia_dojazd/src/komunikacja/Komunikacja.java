package komunikacja;

import java.io.Serializable;

public interface Komunikacja extends Serializable {
    double obliczKoszt(double dystans);
    int obliczPrzesiadki(double dystans);

    double obliczCzas(double dystans);
}
