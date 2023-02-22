import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Roslina roslina = new Roslina(1);
        Zwierzak zwierzak = new Zwierzak();
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Jeśli chcesz zeby roślina urosła o 1 wpisz '1'");
            System.out.println("Jeśli chcesz zeby roślina urosła o 3 wpisz '2'");
            System.out.println("Jeśli chcesz zeby zwierzak zjadł rosline o 1 wpisz '3'");
            System.out.println("Jeśli chcesz zeby pokazac rosline wpisz '4'");
            System.out.println("Aby zakonczyc dzialanie programu wpisz '5'");
            System.out.println("-------------------------------------------");
            System.out.println("Wybór: ");
            String userChoice = scanner.nextLine();
            switch (userChoice){
                case "1" -> roslina.Rosnij();
                case "2" -> roslina.RosnijDuzo(3);
                case "3" -> zwierzak.Zjedz(roslina,1);
                case "4" -> roslina.Pokaz();
                case "5" -> System.exit(0);
                default -> System.out.println("Wybrałeś złą opcję!");
            }

        }
    }
}