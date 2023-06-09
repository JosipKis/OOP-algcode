package vjezba4.zad3;

import java.util.List;

public class Main3JavaSolution {

    /*
         za testiranje rezulatat u Javi, vrijeme je gotovo isto u provjeri za 100 ponavljanja,
         ali već na 10000 ponavljanja vrijeme rekurzije je dvostruko duže od normalnog.
         U testiranju za 1000000 ponavljanja za oko 1.5 puta sporije, ali ipak znatno brže od onog
         provjerenog u Pythonu.
     */

    public static void main(String[] args) {
        timer(1000000);
    }

    public static long recursionPotention(int x, List<Integer> n) {
        if (n.isEmpty()) {
            return 0;
        } else {
            long res = (long) Math.pow(x, n.get(0));
            return res + recursionPotention(x, n.subList(1, n.size()));

        }
    }

    public static void normalPotention(int x, List<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            long pp = (long) Math.pow(x, n.get(i));
        }
    }

    private static void timer(int numOfRepeats){
        long startTime = System.currentTimeMillis();
        for (int c = 0; c < numOfRepeats; c++) {
            recursionPotention(2, List.of(2, 5, 7, 11, 15, 25, 30, 50, 63));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Recursion time: " + (endTime - startTime) + " ms");
        System.out.println("--------------------------------------------------");
        startTime = System.currentTimeMillis();
        for (int c = 0; c < numOfRepeats; c++) {
            normalPotention(2, List.of(2, 5, 7, 11, 15, 25, 30, 50, 63));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Normal time: " + (endTime - startTime) + " ms");
    }
}
