package lab3_oop;

import java.util.Scanner;

public class MiscClass {
    private static int dan = 0;
    private static int sati = 0;
    private static int minute = 0;

    public static void minuteUVrijeme(){
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj minuta za konverziju: ");
        int broj = unos.nextInt();
        for (int c = 0; c < broj; c++){
            minute++;
            if (minute == 60){
                sati++;
                minute = 0;
                if (sati == 24){
                    dan++;
                    sati = 0;
                }
            }
        }
        System.out.println("Uneseno minuta: "+ broj);
        System.out.println(dan +" d: "+ sati +" h: "+ minute +" m:");
    }
}
