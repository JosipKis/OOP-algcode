package pckg_gameExceptions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameTest {

    private static Scanner scanner;

    public static void main(String[] args) {
        String filePath = "OopPredavanja/src/pckg_gameExceptions/AgeData.txt";
//        Set<Integer> numbers = new HashSet<>();
//        numbers = GameCls.readDataToSetStructure(filePath, scanner);
//        System.out.println(numbers);
//        int rndVal = GameCls.getRndFromDataStructure(numbers);
//        System.out.println(rndVal);
        GameCls.playGame(scanner, filePath);
    }
}
