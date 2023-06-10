package vjezba5Zad5;

import java.util.ArrayList;
import java.util.HashMap;

public class MAIN5 {

    public static void main(String[] args) {
        CircularlyQueue<Integer> wheel = Game.genRandPlacement();
        ArrayList<Integer> pl1 = new ArrayList<>();
        ArrayList<Integer> pl2 = new ArrayList<>();
        ArrayList<Integer> pl3 = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> players = new HashMap<>();
        players.put(1, pl1);
        players.put(2, pl2);
        players.put(3, pl3);
        Game.playGame(players, 7, wheel, 200);
        Game.results(players);
    }
}
