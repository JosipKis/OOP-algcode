package zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    private static boolean trueVal = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Integer value: ");
        while (trueVal){
            try{
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
                trueVal = false;
            }catch (InputMismatchException e){
                System.out.println("Wrong input -> only integers are allowed :)");
                System.out.println("Would you like to try again? (y/n)");
                scanner.nextLine();
                String answer = scanner.nextLine();
                if(answer.equals("y")){
                    System.out.print("Please enter a Integer value: ");
                }else{
                    System.out.println("Goodbye!");
                    trueVal = false;
                }

                }
            }
        }
}
