package vjezba4.zad3;

public class Main3JavaSolution {

/*
U Javi ipak drukcije rješenje, provjere za 100 i 10000 su otrpilike jednake, ali
provjera za 1000000 je bila više od 10 puta brža rekurzijom 8[.
 */


    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        recursionPotention(2, 1000000);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Recursion time: "+ (timeEnd - timeStart));
        System.out.println("--------------------------------------------");
        timeStart = System.currentTimeMillis();
        normalPotention(2, 1000000);
        timeEnd = System.currentTimeMillis();
        System.out.println("Normal time: "+ (timeEnd - timeStart));
    }

    public static long recursionPotention(int x, int n) {
        if (n == 0){
            return 1;
        }else if (n % 2 == 0){
            long num = (long) Math.pow(x, n);
            return (long) Math.sqrt(num);
        }else {
            long num = (long) Math.pow(x, n);
            return (long) ((long) x * Math.sqrt(num));
        }
    }

    public static long normalPotention(int x, int n) {
        long potention = 0;
        for (int c = 0; c < n; c++){
            potention = (long) Math.pow(x, c);
        }
        return potention;
    }
}
