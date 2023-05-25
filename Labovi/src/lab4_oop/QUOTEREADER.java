package lab4_oop;
// all imports

import java.io.*;
import java.util.*;

public class QUOTEREADER {

    // static field - key:value data structure
    public static TreeMap<String, String> treeMap = new TreeMap<>();


    // reads data from file and fills appropriate data structure
    public static void readDataFromFile(String filePath)  {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    treeMap.put(key, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // getters for static field
    public static TreeMap<String, String> getTreeMap() {
        return treeMap;
    }

    // list all quotes
    public static void listAllQuotes(){
        readDataFromFile("Labovi/src/lab4_oop/quotes.txt");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}