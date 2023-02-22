public class Roslina {
    int dlugosc;
    public Roslina(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public void Rosnij(){
        if(dlugosc>0){
            dlugosc += 1;
        }
        else{
            System.out.println("Rośliny nie ma!");
        }
    }
    public int RosnijDuzo(int a){
        if(dlugosc>0){
            dlugosc+=a;
        }
        else {
            System.out.println("Rośliny nie ma!");
        }
        return dlugosc;
    }
     public void Pokaz(){
         if(dlugosc<=0){
             System.out.println("Rośliny nie ma!");
             System.exit(0);
         }
        else{System.out.println("Dlugosc rosliny to: "+ dlugosc);

         for (int i = 1; i <= dlugosc; i++) {
             for (int j = dlugosc - i; j > 0; j--) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i; k++) {
                 System.out.print("* ");
             }
             System.out.println();
         }

     }}
}
