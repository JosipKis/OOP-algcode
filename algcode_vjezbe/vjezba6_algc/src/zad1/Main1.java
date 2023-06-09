package zad1;

import java.util.concurrent.ThreadLocalRandom;

public class Main1 {

    public static void main(String[] args) {
        int c = 0;
        long startTimer = System.currentTimeMillis();
        while (c < 1000){
            generateIntArray(1000, -500, 500);
            c++;
        }
        long endTimer = System.currentTimeMillis();
        System.out.println("Time to generate 1000 arrays of size 1000: " + (endTimer - startTimer) + " ms");
    }

    private static boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found key at index: " + mid);
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }

        }
        System.out.println("Key not found");
        return false;
    }

    private static int[] generateIntArray(int size, int min, int max){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        return arr;
    }


}
