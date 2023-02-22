package osoby;

import komunikacja.Autobus;
import komunikacja.Komunikacja;
import komunikacja.Pociag;
import samodzielnie.Pieszo;
import samodzielnie.Rower;
import samodzielnie.Samodzielnie;


import java.io.*;
import java.util.Scanner;

public abstract class Trasa implements Serializable  {
    transient private Scanner scanner = new Scanner(System.in);
    protected Komunikacja komunikacja;
    protected Samodzielnie samodzielnie;
    private String AlgorytmInfoKomunikacja;
    private String AlgorytmInfoSamodzielnie;
    public void dojedzKomunikacja(){
        System.out.println("|Potrzebny czas: "+komunikacja.obliczCzas(100)+" min.");
        System.out.println("|Koszt: "+komunikacja.obliczKoszt(100)+" zł.");
        System.out.println("|Ilość przesiadek: "+komunikacja.obliczPrzesiadki(100));
        System.out.println();
    }
    public void dojedzSamodzielnie(){
        System.out.println("|Potrzebny czas: "+samodzielnie.obliczCzas(2)+" min.");
        System.out.println("|Spalone kalorie: "+samodzielnie.obliczKalorie(2)+" kcal.");
        System.out.println();
    }
    public void lacznyCzas(){
        double czas = samodzielnie.obliczCzas(2)+komunikacja.obliczCzas(100);
        System.out.println("|Łączny czas: "+czas+" min.");
        System.out.println();
    }

    public abstract void wyswietlInfo();

    public void ZmienStrategie(){
        System.out.println("|Ma jechać autobusem: '1'.");
        System.out.println("|Ma jechać pociagiem: '2'.");
        System.out.println("|Ma iść pieszo: '3'.");
        System.out.println("|Ma jechać rowerem: '4'.");
        System.out.println("|Zapisz zmiany: '0'.");
        boolean shouldContinue =true;
        while (shouldContinue) {
            System.out.println("Wybór:");
            String wyboro1 = scanner.nextLine();
            switch (wyboro1) {
                case "1":
                    this.komunikacja = new Autobus();
                    setAlgorytmInfoKomunikacja("autobusem.");
                    break;
                case "2":
                    this.komunikacja = new Pociag();
                    setAlgorytmInfoKomunikacja("pociagiem.");
                    break;
                case "3":
                    this.samodzielnie = new Pieszo();
                    setAlgorytmInfoSamodzielnie("idzie pieszo.");
                    break;
                case "4":
                    this.samodzielnie = new Rower();
                    setAlgorytmInfoSamodzielnie("jedzie rowerem.");
                    break;
                case "0":
                    shouldContinue=false;
                    System.out.println("Zapisano zmiany!");
                    break;
                default:
                    System.out.println("Zla opcja.");
            }
        }
    }

    public String getAlgorytmInfoKomunikacja() {
        return AlgorytmInfoKomunikacja;
    }

    public void setAlgorytmInfoKomunikacja(String algorytmInfoKomunikacja) {
        AlgorytmInfoKomunikacja = algorytmInfoKomunikacja;
    }

    public String getAlgorytmInfoSamodzielnie() {
        return AlgorytmInfoSamodzielnie;
    }

    public void setAlgorytmInfoSamodzielnie(String algorytmInfoSamodzielnie) {
        AlgorytmInfoSamodzielnie = algorytmInfoSamodzielnie;
    }
}
