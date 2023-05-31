package zadatak1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main5RefZd1Vj7 implements Comparator<String> {

    public static void main(String[] args) {
        ArrayList<String> vehicleArrayList = arrayList();
        System.out.println("********** ArrayList without sorting **********");
        System.out.println(vehicleArrayList);
        System.out.println("---------- ArrayList after using sort() from Collections ----------");
        Collections.sort(vehicleArrayList);
        System.out.println(vehicleArrayList);
        // Collections.sort() je sortirao elemente po abecednom redu (od a do z)
        System.out.println("---------- ArrayList after sorting using Comparator ----------");
        Collections.sort(vehicleArrayList, new Main5RefZd1Vj7());
        for (String str: vehicleArrayList){
            System.out.println(str);
        }
        System.out.println("*********** Reversed contents of the ArrayList ***********"); //vj7zd1
        Collections.reverse(vehicleArrayList);  //vj7zd1
        for (String str: vehicleArrayList){  //vj7zd1
            System.out.println(str);  //vj7zd1
        }
    }

    private static ArrayList<String> arrayList(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("auto");
        stringArrayList.add("svemirski brod");
        stringArrayList.add("avion");
        stringArrayList.add("helikopter");
        stringArrayList.add("jedrilica");
        stringArrayList.add("gliser");
        stringArrayList.add("romobil");
        stringArrayList.add("bicikla");
        return stringArrayList;
    }


    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){
            return 1;
        } else if (o2.length() > o1.length()) {
            return -1;
        }else {
            return 0;
        }
    }
}
