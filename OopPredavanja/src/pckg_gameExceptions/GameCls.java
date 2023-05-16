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
        int numOfAttempts = 1;
        int totalAttempts = 1;
        int victories = 0;
        Set<Integer> nums = readDataToSetStructure(filePath, scanner);
        scanner = new Scanner(System.in);
        int numToGuess = getRndFromDataStructure(nums);
        int unHint = ThreadLocalRandom.current().nextInt(numToGuess-20, numToGuess);
        int ovHint = ThreadLocalRandom.current().nextInt(numToGuess, numToGuess+20);
        System.out.println("Please enter your guess for age: ");
        while (numOfAttempts <= 10) {
            String guessAsStr = scanner.nextLine();
            try {
                Integer guess = Integer.parseInt(guessAsStr);
                if (guess == numToGuess) {
                    System.out.println("YOU WON!!!");
                    victories++;
                    System.out.println("You took "+ numOfAttempts +" attempts to get the number right!");
                    numOfAttempts = 0;
                    totalAttempts++;
                    numToGuess = getRndFromDataStructure(nums);
                }else {
                    System.out.println("Your guess: "+ guess +" | numToGuess: "+ guessHints(numToGuess, unHint, ovHint));
                    if ((ovHint > unHint) && (unHint < numToGuess)){
                        unHint += 2;
                    } else if ((ovHint > unHint) && (ovHint > numToGuess)) {
                        ovHint -= 2;
                    }
                    System.out.println(numToGuess); //remove this shii
                }
            }catch (NumberFormatException nfe) {
                System.out.println("Wrong input for integer parsing...");
            }finally {
                System.out.println("Press y on your keyboard to continue and n to exit the game...");
                String cont = scanner.nextLine();
                if (numOfAttempts == 11){
                    break;
                }
                if (cont.equalsIgnoreCase("y")){
                    System.out.println("Continuing the game...");
                    numOfAttempts++;
                    totalAttempts++;
                }else if(cont.equalsIgnoreCase("n")){
                    System.out.println("Exiting the game...");
                    System.out.println("Total attempts= "+ totalAttempts);
                    if (victories > 0){
                        System.out.println("Number of wins: "+ victories);
                    }
                    break;
                }else {
                    System.out.println("Unexpected input.\nContinuing the game...");
                    numOfAttempts++;
                    totalAttempts++;
                    scanner.next();
                }
            }
        }
        if (numOfAttempts == 11) {
            System.out.println("Game over!\nYou took over 10 attempts and still didn't get it right...");
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

    public static String guessHints(int num, int unHint, int ovHint){
        if ((num > 20) && (num < 140)){
            System.out.println("Between "+ unHint +" and "+ ovHint);
        } else if (num <= 20) {
            System.out.println("between 0 "+ ovHint);
        }
        return "Guess :P"; //change to something that makes sense
    }

}
