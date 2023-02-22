package Konto;

import java.util.Random;

public class Waluta {
    Random random = new Random();
    private int name;

    public Waluta(){
       name = random.nextInt(1,5);
    }
    public Waluta(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
