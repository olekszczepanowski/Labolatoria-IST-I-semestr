package main;

public abstract class Figura {
    private String kolor;
    private int a;
    private int b;

    public Figura(String kolor, int a, int b) {
        this.kolor = kolor;
        this.a = a;
        this.b = b;
    }
    public abstract int Obwod();

    public String getKolor() {
        return kolor;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}

