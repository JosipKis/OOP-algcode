package zadatak2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main2 {

    private static final int MINVAL = 10;
    private static final int MAXVAL = 1000;

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList = fillArrayListWithIntegers(integerArrayList, 12);
        System.out.println("************ ArrayList before sorting ************");
        System.out.println(integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println("************ ArrayList after sorting ************");
        System.out.println(integerArrayList);
        ArrayList<Integer> finalIntegerArrayList = integerArrayList;
        ReverseOrder integerArrayListReversed = new ReverseOrder() {
            @Override
            public void reverseOrder(ArrayList<Integer> arrayList) {
                Collections.reverse(finalIntegerArrayList);
                System.out.println("************ ArrayList in reversed order ************");
                System.out.println(finalIntegerArrayList);
            }
        };
        integerArrayListReversed.reverseOrder(integerArrayList);
    }

    private static ArrayList<Integer> fillArrayListWithIntegers(ArrayList<Integer> arrayList, int numElements){
        for (int c = 0; c < numElements; c++){
            arrayList.add(ThreadLocalRandom.current().nextInt(MINVAL, MAXVAL));
        }
        return arrayList;
    }

    interface ReverseOrder{
        void reverseOrder(ArrayList<Integer> arrayList);
    }

}
