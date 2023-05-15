package pckg_gameExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GameCls {

    public static void playGame(Scanner scanner, String filePath){
        Set<Integer> nums = readDataToSetStructure(filePath, scanner);
        scanner = new Scanner(System.in);
        int numToGuess = getRndFromDataStructure(nums);
        System.out.println("Please enter your guess for age: ");
        String guessAsStr = scanner.nextLine();
        try {
            Integer guess = Integer.parseInt(guessAsStr);
            if (guess == numToGuess) {
                System.out.println("YOU WON!!!");
            }else {
                System.out.println("Your guess: "+ guess +" | numToGuess: "+ numToGuess);
            }
        }catch (NumberFormatException nfe) {
            System.out.println("Wrong input for integer parsing...");
        }

    }

    public static Set<Integer> readDataToSetStructure(String filePath, Scanner scanner) {
        File file = new File(filePath);
        Set<Integer> numbers = new HashSet<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                try {
                    int value = Integer.parseInt(line);
                    numbers.add(value);
                }catch (NumberFormatException nfe){
                    System.out.println("Not allowed format for integer...");
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static int getRndFromDataStructure(Set<Integer> nums){
        int indx = ThreadLocalRandom.current().nextInt(0, nums.size());
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        return arr[indx];
    }
}
