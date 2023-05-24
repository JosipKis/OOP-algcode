package pckg_frequency_counter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AUXCLS {

    public static HashMap<Integer, Integer> wordLengthCounter(ArrayList<String> text, int[] length){
        HashMap<Integer, Integer> freqCounter = new HashMap<>();
        for (int num: length){
            freqCounter.put(num, 0);
        }
        for (String line: text){
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
            for (String word: words){
                for (int num: length){
                    if (num == word.length()){
                        int value = freqCounter.get(num) + 1;
                        freqCounter.put(num, value);
                        break;
                    }
                }
            }
        }

        return freqCounter;
    }

    public static boolean fileExists(String filePath){
        File file = new File(filePath);
        boolean exists = file.exists() && file.isFile();
        System.out.println("File exists: "+ exists);
        System.out.println("File path: "+ filePath);

        return exists;
    }

    public static ArrayList<String> readDataFromFile(String filePath){
        ArrayList<String> text = new ArrayList<>();
        if (fileExists(filePath)){
            try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
                String line;
                while((line = br.readLine()) != null){
                    text.add(line);
                }
                System.out.println("Reading data from file is finished!");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Cannot read from file... File doesn't exist.");
        }

        return text;
    }

    public static void readTextFromArrayList(ArrayList<String> text, int numLines){
        for (int k = 0; k < numLines; k++){
            System.out.println(text.get(k));
        }
    }
}
