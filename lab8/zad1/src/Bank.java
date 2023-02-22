public class Bank {
    private static Osoba[] tablicaOsob = new Osoba[20];
    private static int n=0;

    public static void main(String[] args) {
        tablicaOsob[0]=new Klient();
        tablicaOsob[1]=new Pracownik();
        tablicaOsob[2]=new Klient("Kowalski","77032717231",2);
        tablicaOsob[3]=new Klient("Michalski","49031856541",1);
        tablicaOsob[4]=new Klient("Nowak","95021388819",5);
        tablicaOsob[5]=new Klient("Walczybok","01272036522",3);
        tablicaOsob[6]=new Pracownik("Piwnicki","55060141952","Doradca Klienta",5000,50);
        tablicaOsob[7]=new Pracownik("Drab","65060316487","Kasjer",4200,38);
        tablicaOsob[8]=new Pracownik("Wawer","84011565657","Doradca Inwestycyjny",10000,150);
        tablicaOsob[9]=new Pracownik("Szymanski","96112622418","Agent Kredytowy",7000,75);
        tablicaOsob[10]=new Pracownik("Michniewicz","00230531837","Kasjer",5200,55);
        int i =0;
        while(tablicaOsob[i]!=null){
            i++;
            n++;
        }
        wyswietlOsoby();
        wyswietlPracownikow();
        wyswietlKlientow();
        System.out.println("Liczba kasjerow: "+znajdzLiczbeKasjerow()+"\n\n");
        znajdzNajlepiejZarabiajacegoPracownika();


    }
        private static void wyswietlOsoby(){
            for(int i = 0;i<n;i++){
                System.out.println(tablicaOsob[i].toString());
            }
            System.out.println("\n");
        }
        private static void wyswietlPracownikow(){
            System.out.println("Pracownicy: ");
            for(int i = 0;i<n;i++){
                if(tablicaOsob[i]instanceof Pracownik){
                    System.out.print(tablicaOsob[i].toString());
                    System.out.println(" Ilosc nadgodzin= "+((Pracownik) tablicaOsob[i]).getIloscNadgodzin());
                }
            }
            System.out.println("\n");
        }
        private static void wyswietlKlientow(){
            System.out.println("Klienci i ich lokaty:");
            for(int i=0;i<n;i++){
                if(tablicaOsob[i]instanceof Klient){
                    System.out.println(tablicaOsob[i].toString());
                    ((Klient) tablicaOsob[i]).WyswietlLokaty();
                }
            }
            System.out.println("\n");
        }
        private static int znajdzLiczbeKasjerow(){
            int liczbaKasjerow=0;
            for(int i = 0 ; i<n;i++){
                if(tablicaOsob[i]instanceof Pracownik){
                    if(((Pracownik) tablicaOsob[i]).jestKasjerem()){
                        liczbaKasjerow++;
                    }
                }
            }
            return liczbaKasjerow;
        }

        private static void znajdzNajlepiejZarabiajacegoPracownika(){
            double max = 0;
            int znacznikOsoby=0;
            for(int i=0;i<n;i++){
                if(tablicaOsob[i]instanceof Pracownik&&tablicaOsob[i]!=null){
                    if(tablicaOsob[i].Oblicz()>max){
                        max=tablicaOsob[i].Oblicz();
                        znacznikOsoby=i;
                    }
                }
            }
            System.out.println("Najwiecej zarobil pracownik na stanowisku: "+
                    ((Pracownik) tablicaOsob[znacznikOsoby]).getStanowisko()+
                    ". Zarobil: "+tablicaOsob[znacznikOsoby].Oblicz()+" zl.");
    }


}
