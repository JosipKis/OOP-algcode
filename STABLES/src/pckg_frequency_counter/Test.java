package pckg_frequency_counter;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        String filePath = "STABLES\\src\\pckg_frequency_counter\\quotes.txt";
        ArrayList<String> text = AUXCLS.readDataFromFile(filePath);
        AUXCLS.readTextFromArrayList(text, 10);
        int[] lngth = {3, 4, 7, 11, 15};
        HashMap<Integer, Integer> freqCounter = AUXCLS.wordLengthCounter(text, lngth);
        for (Integer key: freqCounter.keySet()){
            System.out.println("N= "+ key +" | freq: "+ freqCounter.get(key));
        }
    }
}
