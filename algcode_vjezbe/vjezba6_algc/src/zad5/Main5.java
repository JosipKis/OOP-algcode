package zad5;

import java.util.*;

public class Main5 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] shuffledArr = shuffleArray(arr);
        System.out.println(Arrays.toString(shuffledArr));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(sortArray(treeSet.toArray())));
    }

    private static <T> T[] shuffleArray(T[] arr){
        List<T> list = Arrays.asList(arr);
        Set<Integer> indexSet = new LinkedHashSet<>();
        while (indexSet.size() < arr.length) {
            int randomIndex = (int) (Math.random() * arr.length);
            indexSet.add(randomIndex);
        }
        T[] shuffledArray = Arrays.copyOf(arr, arr.length);
        int i = 0;
        for (Integer index : indexSet) {
            shuffledArray[i++] = list.get(index);
        }

        return shuffledArray;
    }

    private static <T> T[] sortArray(T[] arr){
        Set<T> treeSet = new TreeSet<>(Arrays.asList(arr));
        return (T[]) treeSet.toArray();
    }
}
