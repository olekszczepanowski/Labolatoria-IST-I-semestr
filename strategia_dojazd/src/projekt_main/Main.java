package projekt_main;

import osoby.Osoba1;
import osoby.Osoba2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Osoba1 o1 = new Osoba1();
        Osoba2 o2 = new Osoba2();


        System.out.println("Program dotyczący dojazdu ucznia do szkoły.");
        System.out.println("Uczeń musi przejechac 100km komunikacją, a 2 km samodzielnie.");
        System.out.println("-----------------------------------------------------------------");
        for (; ; ) {
            System.out.println("|Strategia ustawiona dla osoby 1: '1'");
            System.out.println("|Strategia ustawiona dla osoby 2: '2'");
            System.out.println("|Zmień strategię dla osoby 1: '3'");
            System.out.println("|Zmień strategię dla osoby 2: '4'");
            System.out.println("|Zapisz osoby do pliku: '5'");
            System.out.println("|Odczytaj osoby z pliku: '6'");
            System.out.println("|Zakończ program: '0'");
            System.out.println("|Wybór: ");
            String wybor = scanner.nextLine();
            switch (wybor) {
                case "1":
                    o1.dojedzKomunikacja();
                    o1.dojedzSamodzielnie();
                    o1.lacznyCzas();
                    o1.wyswietlInfo();
                    break;
                case "2":
                    o2.dojedzKomunikacja();
                    o2.dojedzSamodzielnie();
                    o2.lacznyCzas();
                    o2.wyswietlInfo();
                    break;
                case "3":
                    o1.ZmienStrategie();
                    o1.wyswietlInfo();
                    o1.dojedzKomunikacja();
                    o1.dojedzSamodzielnie();
                    o1.lacznyCzas();
                    break;
                case "4":
                    o2.ZmienStrategie();
                    o2.wyswietlInfo();
                    o2.dojedzKomunikacja();
                    o2.dojedzSamodzielnie();
                    o2.lacznyCzas();
                    break;
                case "5":
                    //Zapisuje do obiekty do pliku
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("osobyinfo.dat"));
                    out.writeObject(o1);
                    out.writeObject(o2);
                    break;
                case "6":
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream("osobyinfo.dat"));
                    Osoba1 o3 = (Osoba1) in.readObject();
                    Osoba2 o4 = (Osoba2) in.readObject();
                    // Wyświetlamy informacje o odczytanych obiektach
                    System.out.println("Odczytana z pliku osoba 1");
                    o3.dojedzKomunikacja();
                    o3.dojedzSamodzielnie();
                    o3.wyswietlInfo();
                    System.out.println("Odczytana z pliku osoba 2");
                    o4.dojedzKomunikacja();
                    o4.dojedzSamodzielnie();
                    o4.wyswietlInfo();
                    break;
                case "0":
                    System.out.println("Koniec programu.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Błędna opcja. Spróbuj ponownie.");
            }
        }

    }
}