package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Wielokaty {
    Scanner sc = new Scanner(System.in);

    private ArrayList<Figura> wielokaty;
    private FiguraCompare_Kolor Comparator1;
    private FiguraCompare_BokA Comparator2;
    private FiguraCompare_Kolor_BokA Comparator3;

    public Wielokaty() {
        wielokaty = new ArrayList<Figura>();
    }

    public static void main(String[] args) {
        Wielokaty w = new Wielokaty();
        Scanner scanner = new Scanner(System.in);
        w.CreateWielokaty();
        w.CreateComparators();
        for(;;){
            System.out.println("------------------------------------------------");
            System.out.println("'1' Wyświetl wielokaty.");
            System.out.println("'2' Posortuj wielokaty.");
            System.out.println("'3' Wyswietl wielokat z najwiekszym obwodem.");
            System.out.println("'0' Zakoncz program.");
            System.out.println("Wybor: ");
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "1"-> w.ViewWielokaty();
                case "2"-> w.SortWielokaty();
                case "3"-> w.WyswietlObwod();
                case "0"-> System.exit(0);
                default -> System.out.println("Zła opcja!");
            }
        }
    }

    public void CreateWielokaty(){
        wielokaty.add(new Trojkat("Zielony",10,5,14));
        wielokaty.add(new Trojkat("Niebieski",12,12,3));
        wielokaty.add(new Trojkat("Niebieski",4,6,4));
        wielokaty.add(new Trojkat("Czerwony",7,7,7));
        wielokaty.add(new Trojkat("Zielony",1,1,8));
        wielokaty.add(new Prostokat("Czerwony",5,4));
        wielokaty.add(new Prostokat("Niebieski",3,3));
        wielokaty.add(new Prostokat("Zielony",13,10));
        wielokaty.add(new Prostokat("Czerwony",8,5));
        wielokaty.add(new Prostokat("Niebieski",3,2));
        wielokaty.add(new Prostokat("Zielony",2,2));
    }
    public void SortWielokaty(){
        String userchoice;
        System.out.println("Wybierz opcje:");
        System.out.println("'1' Sortuj po kolorze.");
        System.out.println("'2' Sortuj po boku a.");
        System.out.println("'3' Sortuj po kolorze i boku.");
        userchoice= sc.nextLine();
        switch(userchoice){
            case "1"->Collections.sort(wielokaty,Comparator1);
            case "2"->Collections.sort(wielokaty,Comparator2);
            case "3"->Collections.sort(wielokaty,Comparator3);
            default -> System.out.println("Zła opcja");
        }
        System.out.println("Sortowanie wykonane!");
    }

    public void WyswietlObwod(){
        int max = 0;
        int znacznik = 0;
        for(int i = 0 ; i<wielokaty.size();i++){
            if(wielokaty.get(i).Obwod()>max){
                max = wielokaty.get(i).Obwod();
                znacznik=i;
            }
        }
        System.out.println("Pozycja figury z najwiekszym obwodem:"+znacznik+" "+wielokaty.get(znacznik));
    }

    public void CreateComparators(){
        Comparator1=new FiguraCompare_Kolor();
        Comparator2=new FiguraCompare_BokA();
        Comparator3=new FiguraCompare_Kolor_BokA();
    }
    public void ViewWielokaty(){
        for(int i = 0;i<wielokaty.size();i++){
            System.out.println("main.Figura "+i+": "+wielokaty.get(i));
        }
    }

    class FiguraCompare_Kolor implements Comparator<Figura>{
        public int compare(Figura f1, Figura f2){
            return f1.getKolor().compareTo(f2.getKolor());
        }
    }
    class FiguraCompare_BokA implements Comparator<Figura>{
        public int compare(Figura f1,Figura f2){
            return Integer.compare(f1.getA(),f2.getA());
        }
    }
    class FiguraCompare_Kolor_BokA implements Comparator<Figura>{

        public int compare(Figura f1, Figura f2) {
            int wynik = f1.getKolor().compareTo(f2.getKolor());
            if (wynik == 0) {
                wynik = Integer.compare(f1.getA(), f2.getA());
            }
            return wynik;
        }
    }


    public ArrayList<Figura> getWielokaty() {
        return wielokaty;
    }

    public FiguraCompare_Kolor getComparator1() {
        return Comparator1;
    }

    public FiguraCompare_BokA getComparator2() {
        return Comparator2;
    }

    public FiguraCompare_Kolor_BokA getComparator3() {
        return Comparator3;
    }
}
