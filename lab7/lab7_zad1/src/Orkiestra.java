public class Orkiestra {
    private static Instrument[] orkiestra = new Instrument[20];
    private static int n=0;
    public static void main(String[] args) {
        stworzOrkiestre();
        wyswietlOrkiestre();
        grajOrkiestro();
        znajdzMaxInstrumentow();
        wyswietlDete();
        wyswietlSmyczkowe();
        System.out.println("Ilosc kontrabasow: "+iloscKontrabasow());


    }
    public static void stworzOrkiestre(){
        orkiestra[0] = new InstrumentDety();
        orkiestra[1] = new InstrumentDety("Trabka", 2);
        orkiestra[2] = new InstrumentSmyczkowy("Skrzypce", 5);
        orkiestra[3] = new InstrumentDety("Puzon", 5);
        orkiestra[4] = new InstrumentSmyczkowy("Wiolonczela", 3);
        orkiestra[5] = new InstrumentDety("Tuba", 2);
        orkiestra[6] = new InstrumentSmyczkowy();
        orkiestra[7] = new InstrumentDety("Róg", 1);
        orkiestra[8] = new InstrumentSmyczkowy("Altówka", 2);
        orkiestra[9] = new InstrumentDety("Klarnet", 5);
        orkiestra[10] = new InstrumentSmyczkowy("Kontrabas", 2);
        while (orkiestra[n] != null) {
            n++;
        }
    }
    public static void wyswietlOrkiestre(){
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.println(orkiestra[i].toString());
        }
        System.out.println("\n");
    }
    public static void grajOrkiestro(){
        for (int i = 0; i < n; i++)
            orkiestra[i].graj();
        System.out.println("\n");
    }
    public static void znajdzMaxInstrumentow(){
        int maxInstrumentow = orkiestra[0].getIlosc();
        System.out.println("Najwieksza ilosc instrumentow: \n");
        for (int i = 0; i < n; i++) {
            if (orkiestra[i].getIlosc() > maxInstrumentow) {
                maxInstrumentow = orkiestra[i].getIlosc();
            }
        }
        for (int j = 0; j < n; j++) {
            if (orkiestra[j].getIlosc() == maxInstrumentow) {
                if (orkiestra[j] instanceof InstrumentDety)
                    System.out.println("Instrument dety znajdujący sie na miejscu: " + j+"\n");
                if (orkiestra[j] instanceof InstrumentSmyczkowy)
                    System.out.println("Instrument smyczkowy znajdujący sie na miejscu: " + j+"\n");
            }
        }
        System.out.println();
    }

    public static void wyswietlDete(){
        System.out.println("Same instrumenty dęte:");
        for (int i = 0; i < n; i++) {
            if (orkiestra[i] instanceof InstrumentDety) {
                System.out.println(orkiestra[i].toString());
            }
        }
        System.out.println("\n");
    }
    public static void wyswietlSmyczkowe(){
        System.out.println("Same instrumenty smyczkowe: ");
        for (int i = 0; i < n; i++) {
            if (orkiestra[i] instanceof InstrumentSmyczkowy) {
                System.out.println(orkiestra[i].toString());
            }
        }
        System.out.println("\n");
    }
    public static int iloscKontrabasow(){
        int iloscKontrabasow = 0;
        for (int i = 0; i < n; i++) {
            if(orkiestra[i]instanceof InstrumentSmyczkowy){
                if(((InstrumentSmyczkowy) orkiestra[i]).jestKontrabasem()){
                    iloscKontrabasow=orkiestra[i].getIlosc();
                }
            }
        }
        return iloscKontrabasow;
    }


}
