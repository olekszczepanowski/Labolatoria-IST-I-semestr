import java.util.Scanner;

public class Lab4cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("'K':Kula");
            System.out.println("'P':Prostopadłościan");
            System.out.println("'S':Stop");
            System.out.println("Wybierz opcje: ");
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "K" -> System.out.println("Pole kuli: "+PoleKuli(1)+
                        " Objetosc kuli: "+ObjetoscKuli(1));
                case "P" -> System.out.println("Pole prostopadłoscianu: "+PoleProstopadloscianu(2,3,4)
                        +" Objetosc prostopadłoscianu: "+ObjetoscProstopadloscianu(2,3,4));
                case "S" -> System.exit(0);
                default -> System.out.println("Zła opcja");
            }
        }
    }
    private static double PoleKuli(double r){
        double pole = 4*Math.PI*r*r;
        return pole;
    }
    private static double ObjetoscKuli(double r){
        double objetosc = Math.PI*r*r*r*4/3;
        return objetosc;
    }
    private static double PoleProstopadloscianu(double a,double b,double c){
        double pole = 2*a+2*b+2*c;
        return pole;
    }
    private static double ObjetoscProstopadloscianu(double a,double b,double c){
        double objetosc = a*b*c;
        return objetosc;
    }


}