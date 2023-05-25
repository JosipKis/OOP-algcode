package zadatak2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(21, "Stipe");
        hashMap.put(159, "Divna");
        hashMap.put(985, "Etna");
        hashMap.put(455, "Petar");
        hashMap.put(5788, "Vlatka");
        System.out.println("------HashMap------");
        for ( Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String name = entry.getValue();
            System.out.println("ID = "+ key +" Name = "+ name);
        }
        System.out.println("------TreeMap------");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        printAnyMap(treeMap);
        LinkedHashMap<Integer, String> lhashMap = new LinkedHashMap<>();
        System.out.println("------LinkedHashMap------");
        lhashMap.putAll(hashMap);
        printAnyMap(lhashMap);
    }

    public static <E> void printAnyMap(Map<?, ?> map){
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object name = entry.getValue();
            System.out.println("ID = " + key + " Name = " + name);

        }
    }
}
