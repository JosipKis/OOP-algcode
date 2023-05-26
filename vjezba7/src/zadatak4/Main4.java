package zadatak4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main4 implements Comparator<String> {

    public static void main(String[] args) {
        File file = new File("vjezba7/src/zadatak4/file.txt");
        LinkedList<String> linkedList = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                linkedList.add(scanner.nextLine());
            }
            System.out.println("********** LinkedList with strings **********");
            System.out.println(linkedList);
            Collections.sort(linkedList, new Main4());
            Collections.reverse(linkedList);
            System.out.println("********** LinkedList sorted by String length **********");
            System.out.println(linkedList);
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found - check the file location!");;
        }
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
