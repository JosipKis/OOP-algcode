package p15_5_pckg_exceptions;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameAge {

    private static Scanner scanner;
    private static ArrayList<Integer> ages = new ArrayList<>();

    public static void main(String[] args) {
        ages = new ArrayList<>();
        scanner = new Scanner(System.in);
        enterAge();
    }

    private static void checkAge(int ageVal) throws InvalidAttributeValueException {
        if (ageVal <= 0 || ageVal > 120){
            System.out.println("Wrong value - must be 1 or greater till 120...");
            throw new InvalidAttributeValueException("This value is not allowed!");
        }else {
            System.out.println("You have entered acceptable age value: "+ ageVal);
        }
    }

    private static void enterAge(){
        int age = 0;
        boolean status = true;
        while (status){
            System.out.println("Enter your age value as integer: ");
            try{
                age = scanner.nextInt();
                checkAge(age);
                ages.add(age);
            }catch (InputMismatchException ime){
                System.out.println("Integer is required");
                scanner.next();
            }catch (InvalidAttributeValueException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }finally {
                System.out.println("For new input y and n for exit: ");
                String cont = scanner.next();
                if (cont.equalsIgnoreCase("y")){
                    System.out.println("Proceed to new age input");
                }else {
                    System.out.println("Exit from inputs...");
                    status = false;
                }
            }
        }
        calculateAverageAgeAndShow(ages);
    }

    private static void calculateAverageAgeAndShow(ArrayList<Integer> values){
        long sumVals = 0;
        float avg;
        for (Integer val: values){
            sumVals += val;
        }
        avg = (float) sumVals / values.size();
        System.out.println("Values:\n"+ values);
        System.out.println("Average value is: "+ avg);
    }
}
