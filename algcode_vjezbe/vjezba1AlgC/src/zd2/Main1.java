package zd2;

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
        System.out.println("----------------------------------------------------------");
        System.out.println("The list sorted in descending order:");
        System.out.println(Arrays.toString(sortiInDescendingOrder(generatedArr)));
        System.out.println("----------------------------------------------------------");
        System.out.println("The list sorted in ascending order:");
        System.out.println(Arrays.toString(sortInAscendingOrder(generatedArr)));
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

    private static int[] sortiInDescendingOrder(int[] arr){
        long startTimer = System.nanoTime();
        int temp = 0;
        for (int c = 0; c < arr.length; c++){
            for (int d = 0; d < arr.length; d++){
                if (arr[c] > arr[d]){
                    temp = arr[c];
                    arr[c] = arr[d];
                    arr[d] = temp;
                }
            }
        }
        long endTimer = System.nanoTime();
        System.out.println("The time it took to sort the array in descending order: "+ (endTimer - startTimer) + " nanoseconds");
        return arr;
    }

    private static int[] sortInAscendingOrder(int[] arr){
        long startTimer = System.nanoTime();
        int temp = 0;
        for (int c = 0; c < arr.length; c++){
            for (int d = 0; d < arr.length; d++){
                if (arr[c] < arr[d]){
                    temp = arr[c];
                    arr[c] = arr[d];
                    arr[d] = temp;
                }
            }
        }
        long endTimer = System.nanoTime();
        System.out.println("The time it took to sort the array in ascending order: "+ (endTimer - startTimer) + " nanoseconds");
        return arr;
    }
}
