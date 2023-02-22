package main;

public class Trojkat extends Figura{
    private int c;
    boolean jestTrojkatem;

    public Trojkat(String kolor, int a, int b, int c) {
        super(kolor, a, b);
        this.c = c;
        if(Math.abs(b - c) < a && a < (b + c)){
            this.jestTrojkatem=true;
        }
        else {
            this.jestTrojkatem=false;
        }
    }

    public int getC() {
        return c;
    }

    public boolean isJestTrojkatem() {
        return jestTrojkatem;
    }

    @Override
    public int Obwod() {
        return getA()+getB()+getC() ;
    }

    @Override
    public String toString() {
        return "Trójkąt: a="+getA()+" b="+getB()+
                " c="+getC()+" kolor: "+getKolor()+" Obwód: "+Obwod()+" jestTrojkatem?:"+isJestTrojkatem();
    }
}
