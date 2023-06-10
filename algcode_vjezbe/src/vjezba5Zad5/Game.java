package vjezba5Zad5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static CircularlyQueue<Integer> genRandPlacement() {

        ArrayList<Integer> arl = new ArrayList<>();
        CircularlyQueue<Integer> wheel = new CircularlyQueue<>();
        int indx;
        int el;
        for (int k = 1; k < 40; k++) {
            arl.add(k);
        }
        while (arl.size() > 0) {
            indx = ThreadLocalRandom.current().nextInt(0, arl.size());
            el = arl.remove(indx);
            wheel.enqueue(el);
        }
        return wheel;
    }

    public static int spinWheel(CircularlyQueue<Integer> wheel, int boundRot) {
        int rot = ThreadLocalRandom.current().nextInt(3, boundRot);
        int cnt = 1;
        while (cnt <= rot) {
            wheel.rotate();
            cnt++;
        }
        return wheel.first();
    }

    public static HashMap<Integer, ArrayList<Integer>> playGame(HashMap<Integer, ArrayList<Integer>> plyrs, int attmpt, CircularlyQueue<Integer> wheel, int boundRot) {
        int val;
        for (Integer key : plyrs.keySet()) {
            ArrayList<Integer> player = plyrs.get(key);
            for (int k = 1; k <= attmpt; k++) {
                val = spinWheel(wheel, boundRot);
                player.add(val);
            }
        }
        return plyrs;
    }

    public static void results(HashMap<Integer, ArrayList<Integer>> players) {

        for (Integer key : players.keySet()) {
            int cnt = 0;
            ArrayList<Integer> player = players.get(key);
            System.out.println("<<<<<<<<<<<<<<<<<<<< Individual results >>>>>>>>>>>>>>>>>>>>");
            System.out.println("Player -> " + key + ":");
            System.out.println(player);
            for (int k = 0; k < player.size(); k++) {
                if(player.get(k)%2 != 0) {
                    cnt++;
                }
            }
            System.out.println("Odd numbers in players' bag:  " + cnt);
        }
    }
}
