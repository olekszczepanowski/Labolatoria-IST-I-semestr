import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Sklep {
    private static Transakcja[] transakcje = new Transakcja[100];
    private static Scanner scanner = new Scanner(System.in);

    private static int n = 0;

    public static void main(String[] args) {
        transakcje[0]=new Transakcja();
        transakcje[1]=new Transakcja(10,new KartaPodstawowa());
        transakcje[2]=new Transakcja(20,new KartaSeniora());
        transakcje[3]=new Transakcja(30,new KartaStudenta());
        n=4;
        for(;;){
            System.out.println("Menu Transakcji");
            System.out.println("---------------");
            System.out.println("Żeby dodać kilka transakcji, wpisz 1");
            System.out.println("Żeby dodać transakcje, wpisz 2");
            System.out.println("Żeby wyswietlic transakcje, wpisz 3");
            System.out.println("Żeby wyswietlic ilosc transakcji z karta seniora, wpisz 4");
            System.out.println("Żeby wyswietlic studenta z najwieksza transakcja, wpisz 5");
            System.out.println("Żeby zapisac do pliku transakcje z karta studenta, wpisz 6");
            System.out.println("Żeby zakończyć program, wpisz 0");
            System.out.println("Wybór:");
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "1"->wstawKilkaTransakcji();
                case "2"->dodajTransakcje();
                case "3"->wyswietlTransakcje();
                case "4"-> System.out.println("Ilość transakcji z kartą seniora: "+transakcjeZKartaSeniora());
                case "5"->wyswietlStudentaKtoryZaplacilNajwiecej();
                case "6"->zapiszDoPliku();
                case "0"->System.exit(0);
            }

        }
    }
    public static void wstawKilkaTransakcji() {
        Random random = new Random();
        for(int i = n;i<=n+2;i++){
        System.out.println("Wstaw transakcję:");
        System.out.println("Podaj kwotę");
        String kwota_uzytkownika = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Wybierz karte: \nKarta Podstawowa=1\nKarta Seniora=2\nKarta Studenta=3\nWybor karty:");
        String wybor_uzytkownika = scanner.nextLine();
        switch(wybor_uzytkownika){
            case "1"-> transakcje[i]=new Transakcja(Integer.valueOf(kwota_uzytkownika),new KartaPodstawowa(random.nextInt(1000,9999), nazwisko));
            case "2"-> transakcje[i]=new Transakcja(Integer.valueOf(kwota_uzytkownika),new KartaSeniora(random.nextInt(1000,9999),nazwisko));
            case "3"-> transakcje[i]=new Transakcja(Integer.valueOf(kwota_uzytkownika),new KartaStudenta(random.nextInt(1000,9999),nazwisko));
        }
        }
        n+=3;
    }
    public static void wyswietlTransakcje(){
        int i = 0;
        while(transakcje[i]!=null){
            System.out.println(transakcje[i].toString());
            i++;

        }
    }
    public static void dodajTransakcje(){
        Random random = new Random();
        System.out.println("Wstaw transakcję:");
        System.out.println("Podaj kwotę");
        String kwota_uzytkownika = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Wybierz karte: \nKarta Podstawowa=1\nKarta Seniora=2\nKarta Studenta=3\nWybor karty:");
        String wybor_uzytkownika = scanner.nextLine();
        switch(wybor_uzytkownika) {
            case "1" -> transakcje[n] = new Transakcja(Integer.valueOf(kwota_uzytkownika), new KartaPodstawowa(random.nextInt(1000, 9999), nazwisko));
            case "2" -> transakcje[n] = new Transakcja(Integer.valueOf(kwota_uzytkownika), new KartaSeniora(random.nextInt(1000, 9999), nazwisko));
            case "3" -> transakcje[n] = new Transakcja(Integer.valueOf(kwota_uzytkownika), new KartaStudenta(random.nextInt(1000, 9999), nazwisko));
        }
        n++;
    }
    public static int transakcjeZKartaSeniora(){
        int iloscKart=0;
        for(int i = 0;i<n;i++){
            if(transakcje[i].getKarta()instanceof KartaSeniora)
                iloscKart++;
        }
        return iloscKart;
    }
    public static void wyswietlStudentaKtoryZaplacilNajwiecej() {
        int znacznik = 0;
        double max = 0;
        for(int i = 0;i<n;i++){
            if(transakcje[i].getKarta()instanceof KartaStudenta){
                if(transakcje[i].kwotaDoZaplaty()>max){
                    max = transakcje[i].kwotaDoZaplaty();
                    znacznik=i;
                }
            }
        }
        System.out.println("Student, który zapłacił najwiecej nazywa się: "+transakcje[znacznik].getKarta().getNazwisko());
        System.out.println("Zapłacił: "+transakcje[znacznik].kwotaDoZaplaty());
    }
    public static void zapiszDoPliku()  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transakcje.txt"));
            writer.write("Transakcje z karta studenta: ");
            for(int i = 0 ; i<n; i++){
                if(transakcje[i].getKarta()instanceof KartaStudenta){
                    writer.write("\n"+transakcje[i].toString());
                }
            }
            writer.close();
        }
            catch (IOException e) {
            throw new RuntimeException(e);
            }
        }
}
