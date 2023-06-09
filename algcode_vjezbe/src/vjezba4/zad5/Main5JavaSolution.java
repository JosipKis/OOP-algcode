package vjezba4.zad5;

import static vjezba4.zad4.Main4JavaSolution.generateArr;

public class Main5JavaSolution {

    public static void main(String[] args) {
        int[] arr = generateArr(1, 10, 10);
        int n = 10;
        for (int c = 0; c < arr.length; c++){
            System.out.print(arr[c] + " ");
        }
        System.out.println("\n"+ binarySearch(arr, n));
    }

    private static boolean binarySearch(int[] arr, int n){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (arr[mid] == n){
                return true;
            }else if (arr[mid] < n){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return false;
    }
}
