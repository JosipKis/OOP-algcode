package vjezba4.zad1;

public class Main1JavaSolution {

    public static void main(String[] args) {
        String res = numPrintByRecursion(11);
        System.out.println(res);
    }

    public static String numPrintByRecursion(int n){
        if (n == 1){
            return "Ovo je poruka :-)";
        } else if (n == 0) {
            return "Zero not allowed!";
            // Isto kao i u Python rjesenju dodajem if statement za n == 0 da izbjegnem beskonacnu petlju
        }else {
            System.out.println("Ovo je poruka :-)");
            return numPrintByRecursion(n-1);
        }
    }
}
