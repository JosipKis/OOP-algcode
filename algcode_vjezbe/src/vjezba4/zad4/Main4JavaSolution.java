package vjezba4.zad4;

import java.util.concurrent.ThreadLocalRandom;

public class Main4JavaSolution {

    public static void main(String[] args) {
        int[] arr = generateArr(1, 100, 10);
        int n = 10;
        System.out.println("Sum of first " + n + " elements is: " + sumOfElements(arr, n));
    }

    private static int[] generateArr(int min, int max, int numEl){
        int[] arr = new int[numEl];
        for (int c = 0; c < numEl; c++){
            arr[c] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return arr;
    }

    private static int sumOfElements(int[] arr, int n){
        int sum = 0;
        if (n <= arr.length){
            if (n == 0){
                return 0;
            }else {
                for (int c = 0; c < n; c++){
                    sum += arr[c];
                }
                return sum;
            }
        }else {
            return 0;
        }
    }
}
