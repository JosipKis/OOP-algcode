package vjezba4.zad2;

import java.util.List;

public class Main3JavaSolution {

    // Ovi programi su dovoljno jednostavni da će vratiti otprilije jednako vrijeme svaki put
    // Za usporedbu realnog vremena prolaska tebali bi provlačiti mnogo veće liste
    // kroz programe da vidimo kako se onda ponašaju.

    public static void main(String[] args) {
        List<Integer> n = List.of(2,5,7,11,15,25,30,50,63);
        long startTime = System.currentTimeMillis();
        recursionPotention(2, n);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        System.out.println("--------------------------------------------------");
        startTime = System.currentTimeMillis();
        normalPotention(2, n);
        endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
    }

    public static long recursionPotention(int x, List<Integer> n){
        if (n.isEmpty()){
            return 0;
        }else {
            long res = (long) Math.pow(x, n.get(0));
            System.out.println(res);
            return res + recursionPotention(x, n.subList(1, n.size()));

        }
    }

    public static void normalPotention(int x, List<Integer> n){
        for (int i = 0; i < n.size(); i++) {
            System.out.println((long) Math.pow(x, n.get(i)));
        }
    }
}
