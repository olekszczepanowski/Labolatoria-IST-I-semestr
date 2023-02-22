package main;

public class Prostokat extends Figura{

    private boolean jestKwadratem;

    public Prostokat(String kolor, int a, int b) {
        super(kolor, a, b);
        if(a==b){
            this.jestKwadratem=true;
        }
        else {
            this.jestKwadratem=false;
        }
    }

    public boolean isJestKwadratem() {
        return jestKwadratem;
    }

    @Override
    public int Obwod() {
       return 2*getA()+2*getB();
    }

    @Override
    public String toString() {
        return "main.Prostokat: a="+getA()+" b="+getB()+ " kolor: "+getKolor()+" Obwód: "+Obwod()+
                " jestKwadratem?:"+isJestKwadratem();
    }
}
