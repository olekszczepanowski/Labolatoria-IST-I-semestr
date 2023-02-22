package Konto;

import Osoba.Osoba;
public class Konto {
    private Waluta waluta;
    private boolean jestAktywne;

    public void setWaluta(int name){
        waluta = new Waluta(name);
    }
    public Waluta getWaluta(){
        return waluta;
    }
    public Konto(){
        waluta=new Waluta(1);
        jestAktywne=false;
    }
    public Konto(Waluta waluta, boolean jestAktywne) {
        this.waluta=waluta;
        this.jestAktywne = jestAktywne;
    }

    public boolean getJestAktywne() {
        return jestAktywne;
    }

    public void setJestAktywne(boolean jestAktywne) {
        this.jestAktywne = jestAktywne;
    }



    public  void getStan(){
        System.out.println(" waluta = "+waluta.getName()+" jestAktywne= "+getJestAktywne());
    }
    public void aktywuj(){
        Osoba.aktywujKonto(this);
    }
    public void dezaktywuj(){
        Osoba.dezaktywujKonto(this);
    }
}
