package p15_5_pckg_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInput {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter some number that can be considered as a double: ");
            try {
                double dn = scanner.nextDouble();
                System.out.println("You have entered: " + dn);
            }catch(InputMismatchException ime) {
                System.out.println("Wrong input from keyboard - double expected");
                String scannerOld = scanner.next();
                System.out.println("Memory from scanner: "+ scannerOld);
            }finally {
                System.out.println("Enter y for continuing and n for exit: ");
                String cont = scanner.next();
                if (cont.equalsIgnoreCase("y")){
                    System.out.println("You chose new input of double value...");
                }else {
                    System.out.println("Exiting from the input prompt...");
                    break;
                }
            }
        }
    }
}
