package vjezba4.zad6;

import java.util.Arrays;
import java.util.List;

public class Main6JavaSolution {

    public static void main(String[] args) {
        Integer[] intArr = {17, 7 , 23, 9, 101, 44, 69, 22, 1111};
        String[] strArr = {"prvi", "drugi","treći", "četvrti", "peti", "šesti", "sedmi", "osmi"};
        System.out.println("Before inversion:");
        System.out.println(Arrays.toString(intArr));
        intArr = inverting(intArr, intArr.length-1, 0);
        System.out.println("After inversion:");
        System.out.println(Arrays.toString(intArr));
        System.out.println("Before inversion:");
        System.out.println(Arrays.toString(strArr));
        strArr = inverting(strArr, strArr.length-1, 0);
        System.out.println("After inversion:");
        System.out.println(Arrays.toString(strArr));
    }


    public static <E> E[] inverting(E[] array,int n, int k) {
        if((n == k) || (n < k)) {
            return array;
        } else {
            E temp = array[k];
            array[k] = array[n];
            array[n] = temp;
            return inverting(array, n-1, k+1);
        }
    }
}
