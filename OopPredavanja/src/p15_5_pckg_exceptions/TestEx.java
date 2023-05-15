package p15_5_pckg_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestEx {

    private static Scanner scanner;

    public static void main(String[] args) {
        int[] arr = {23, -11, 678, 0, 43, 98};
//        System.out.println("Element: "+ arr[5]);
        String filePath = "OopPredavanja/src/p15_5_pckg_exceptions/datafile.txt";
        readFile(filePath);
    }

    private static void readFile(String filePath){
        File file = new File(filePath);
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file is not found - file name: "+ file.getName());
        }
    }
    private static void pp(){

    }

}
