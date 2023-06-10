package zd1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main1 {

    private static final int MIN = 0;
    private static final int MAX = 300;

    public static void main(String[] args) {
        int[] generatedArr = generateArray(10);
        System.out.println("The randomly generated list:");
        System.out.println(Arrays.toString(generatedArr));
        findMaxInArray(generatedArr);
    }

    private static int[] generateArray(int size){
        int[] rndArr = new int[size];
        for (int c = 0; c < size; c++){
            rndArr[c] = ThreadLocalRandom.current().nextInt(MIN, MAX);
        }
        return rndArr;
    }

    private static void findMaxInArray(int[] arr){
        int max = 0;
        for (int c: arr){
            if (c > max){
                max = c;
            }
        }
        System.out.println("The biggest number in the array is: "+ max);
    }
}
