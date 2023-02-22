package Wielomian;

public class Wielomian {
    public static int Hermite(int x,int n){
        int h1 = 1;
        int h2 = 2*x;
        int hn = 0;
        if(n==0){
            return h1;
        }
        else if(n==1){
            return h2;
        }
        else {
            for(int i = 2 ;i<=n;i++){
                hn = 2 * x * h2 - 2 * h1 * (i - 1);
                h1=h2;
                h2=hn;
            }
        return hn;
        }
    }
}
