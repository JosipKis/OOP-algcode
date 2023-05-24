package lab4_oop;
// all imports

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QUOTEREADER {

    // static field - key:value data structure
    public static Map<String, String> quoteMap(){
        Map<String, String> hashMap = new HashMap<>();
        return hashMap;
    }

    // reads data from file and fills appropriate data structure
    public static void readDataFromFile(String filePath)  {
        File file = new File(filePath);
        Map<String, String> fillHasMap = quoteMap();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                int dvotockaIndex = line.indexOf(":");
                if (dvotockaIndex >= 0){
                    String key = line.substring(0, dvotockaIndex + 1);
                    String value = line.substring(dvotockaIndex + 1);
                    fillHasMap.put(key, value);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }
    }

    // getters for static field
    public static Map<String, String> getQuoteMap(){

        return quoteMap();
    }

    // list all quotes 
    public static void listAllQuotes(){
        readDataFromFile("Labovi/src/lab4_oop/quotes.txt");
        for (Map.Entry<String, String> c: quoteMap().entrySet()){
            String key = c.getKey();
            String value = c.getValue();
            System.out.println("Key: "+ key +" value: "+ value);
        }
    }
}