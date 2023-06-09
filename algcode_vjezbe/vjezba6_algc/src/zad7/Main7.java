package zad7;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main7 {

    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        Integer[] shuffledArr = shuffleArray(arr);
//        System.out.println(Arrays.toString(shuffledArr));
        int[] intArr = generateRndArray(10, 0);
        findDuplicates(intArr);
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

    private static int[] generateRndArray(int size, int min){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, size);
        }
        return arr;
    }

    private static void findDuplicates(int[] arr){
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        ArrayList<Integer> listOfDuplicates = new ArrayList<>();
        System.out.println("Starting list: "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (!noDuplicates.contains(arr[i])){
                noDuplicates.add(arr[i]);
            }else {
                listOfDuplicates.add(arr[i]);
            }
        }
        System.out.println("List without duplicates:\n"+ Arrays.toString(noDuplicates.toArray()));
        System.out.println("List of duplicates:\n"+ Arrays.toString(listOfDuplicates.toArray()));
    }
}
