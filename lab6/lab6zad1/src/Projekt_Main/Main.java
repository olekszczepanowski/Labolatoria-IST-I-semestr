package Projekt_Main;

import Konto.Konto;
import Konto.Waluta;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Konto [] bank = new Konto[5];
        for(int i = 0 ;i<bank.length;i++){
            bank[i]= new Konto(new Waluta(random.nextInt(1,5)),false);
        }
        bank[1].aktywuj();
        bank[2].aktywuj();
        bank[2].dezaktywuj();
        bank[4].aktywuj();
        WyswietlKonta(bank);
    }

    public static void WyswietlKonta(Konto[]bank){
        for(int i = 0; i<bank.length;i++){
            System.out.print("Konto o indeksie= "+i);
            bank[i].getStan();
        }
    }
}