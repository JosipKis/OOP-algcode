package zad1;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void readFileScanner(String src) {
        File file = new File(src);
        boolean trueVal = true;
        while (trueVal){
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                    trueVal = false;
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
                System.out.println("Do you want to try again? (y/n)");
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if (answer.equals("n")) {
                    System.out.println("Exiting the program...");
                    trueVal = false;
                }else {
                    System.out.println("Enter the correct path to the file:");
                    src = scanner.nextLine();
                    file = new File(src);
                }
            }
        }
    }

    public static void readFileBufferedReader(String src) {
        File file = new File(src);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createAFile(){
        try {
            File myObj = new File("noviFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String src, String text){
        try {
            FileWriter myWriter = new FileWriter(src);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}