public class Main {
    public static void main(String[] args) {
        Macierz m1 = new Macierz(3, 2);
        Macierz m2 = new Macierz(2, 3);
        m1.StworzMacierz();
        m1.WyswietlTablice();
        m2.StworzMacierz();
        m2.WyswietlTablice();
        System.out.println();
        if (m1.getWiersze() == m2.getKolumny()) {
            int[][] TabIloczyn = new int[m1.getWiersze()][m2.getKolumny()];
            int suma;
            for (int i = 0; i < m1.getWiersze(); i++) {

                for (int j = 0; j < m2.getKolumny(); j++) {

                    suma = 0;

                    for (int k = 0; k < m1.getKolumny(); k++) {

                        suma += m1.getTab()[i][k] * m2.getTab()[k][j];
                    }

                    TabIloczyn[i][j] = suma;
                }
            }
            System.out.println("Iloczyn:");
            for (int i = 0; i < m1.getWiersze(); i++) {

                for (int j = 0; j < m2.getKolumny(); j++)
                    System.out.print(TabIloczyn[i][j] + " ");

                System.out.print("\n");
            }
        } else {
            System.out.println("Nie można wykonać iloczynu macierzy!");
        }
    }
}
