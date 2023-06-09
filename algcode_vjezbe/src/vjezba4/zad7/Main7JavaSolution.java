package vjezba4.zad7;

import java.util.ArrayList;
import java.util.List;

public class Main7JavaSolution {

    public static void main(String[] args) {

        int[] intArr = {17, 7 , 23, 9, 101, 44, 69, 22, 1111};
        System.out.println("Before sorting:");
        for (int c = 0; c < intArr.length; c++){
            System.out.print(intArr[c] + " ");
        }
        System.out.println("\nAfter sorting:");
        int[] sortedArr = recursiveSorting(intArr);
        for (int c = 0; c < sortedArr.length; c++){
            System.out.print(sortedArr[c] + " ");
        }
    }

    public static int[] recursiveSorting(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int pivot = nums[0];
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                smaller.add(nums[i]);
            } else {
                larger.add(nums[i]);
            }
        }
        int[] sortedSmaller = recursiveSorting(smaller.stream().mapToInt(Integer::intValue).toArray());
        int[] sortedLarger = recursiveSorting(larger.stream().mapToInt(Integer::intValue).toArray());
        int[] sortedNums = new int[nums.length];
        System.arraycopy(sortedSmaller, 0, sortedNums, 0, sortedSmaller.length);
        sortedNums[sortedSmaller.length] = pivot;
        System.arraycopy(sortedLarger, 0, sortedNums, sortedSmaller.length + 1, sortedLarger.length);
        return sortedNums;
    }
}
