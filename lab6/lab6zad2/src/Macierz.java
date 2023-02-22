import java.util.Random;

public class Macierz {
    Random random = new Random();
    private int wiersze;
    private int kolumny;

    private int[][]Tab;

    public int[][] getTab() {
        return Tab;
    }

    public Macierz(int wiersze, int kolumny) {
        this.wiersze = wiersze;
        this.kolumny = kolumny;
    }

    public int getWiersze() {
        return wiersze;
    }


    public int getKolumny() {
        return kolumny;
    }


    public void StworzMacierz(){
        Tab = new int[wiersze][kolumny];
            for(int i = 0;i<Tab.length;i++){
                for(int j = 0;j<Tab[i].length;j++){
                Tab[i][j]= random.nextInt(1,5);
                }
            }
    }
    public void WyswietlTablice(){
        System.out.println();
        for(int i = 0;i<Tab.length;i++) {
            for (int j = 0; j < Tab[i].length; j++) {
                System.out.print(Tab[i][j]+" ");
            }
            System.out.println();
        }
    }

}
