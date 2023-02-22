import java.util.Random;

public class Tablica {
    private static Random random = new Random();
    private static int rozmiar=10;

    public Tablica(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    private static int Tab[] = new int[rozmiar];


    public static void utworzTablice() {
        for (int i = 0; i < rozmiar; i++) {
            int x = random.nextInt(-50,50);
            Tab[i] = x;
        }
    }

    public static void wyswietlTablice() {
        System.out.println("Elementy tablicy: ");
        for (int j = 0; j < rozmiar; j++) {
            System.out.print(Tab[j] + " ");
        }
        System.out.println();
    }

    public static void znajdzMinWartosc() {
        int min = 0;
        for(int i = 0 ;i<rozmiar;i++){
            Tab[0]=min;
            if(Tab[i]<min){
                min=Tab[i];
            }
        }
        System.out.println("Najmniejsza wartość= "+min);
    }

    public static void iloczynLiczbNieparzystych() {
        int iloczyn = 1;
        for (int i = 0; i < rozmiar; i++)
            if (Tab[i]%2 != 0) {
                iloczyn *= Tab[i];
            }
        System.out.println("Iloczyn liczb nieparzystych= " + iloczyn);
    }

    public static void ileJestLiczbNieparzystych() {
        int suma = 0;
        for (int i = 0; i < rozmiar; i++)
            if (Tab[i]%2 != 0) {
                suma += 1;
            }
        System.out.println("Suma liczb nieparzystych= "+suma);
    }
}


