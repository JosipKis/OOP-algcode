package zd1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Haker {
    Semafor semafor;
    int[] listaNovihStanja = new int[3];
    private  final int MINVAL = 0;
    private  final  int MAXVAL = 10;

    public Haker(Semafor semafor1){
        this.semafor = semafor1;
    }

    private void novoStanje(){
        for (int c: listaNovihStanja){
            listaNovihStanja[c] = ThreadLocalRandom.current().nextInt(MINVAL, MAXVAL);
        }
        System.out.println("Novi brojevi su generirani! "+ Arrays.toString(listaNovihStanja));
    }

    public void updatePokusaj(){
        novoStanje();
        semafor.setCrveno(String.valueOf(listaNovihStanja[0]));
        semafor.setZeleno(String.valueOf(listaNovihStanja[1]));
        semafor.setZuto(String.valueOf(listaNovihStanja[2]));
        for (int c: listaNovihStanja){
            System.out.println("Hakirano stanje semafora je: "+ c);
        }
    }
}
