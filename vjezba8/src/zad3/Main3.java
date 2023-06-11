package zad3;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        int[] arr = genArr(5);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a index value to be printed:");
        System.out.println("Be careful, the array lenght is: " + arr.length);
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        try{
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception ArrayIndexOutOfBoundsException - This means that the number you entered is bigger than array length.");
        }
    }

    private static int[] genArr(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Please enter " + size + " Integer values: ");
        while (true) {
            try {
                for (int c = 0; c < size; c++) {
                    arr[c] = scanner.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Wrong input -> only integers are allowed :)");
                System.out.println("Would you like to try again? (y/n)");
                scanner.nextLine();
                String answer = scanner.nextLine();
                if (answer.equals("y")) {
                    System.out.print("Please enter a Integer value: ");
                } else {
                    System.out.println("Goodbye!");
                    break;
                }
            }
        }
        return arr;
    }
}
