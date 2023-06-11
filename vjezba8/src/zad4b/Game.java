package zad4b;

import zad4.Generator;
import zad4.UserInpts;
import zad4.UsrInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private static int age2Guess;
    private static int cntr;
    private static int br = 1;
    private static boolean gameContinue;

    public Game(){
        this.cntr = br++;
        this.gameContinue = true;
    }

    public static void runGame(){
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("Game started!");
        System.out.println("Enter the lower and upper limit of the age: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        Generator generator = new Generator(low,high);
        int totalGuesses = 0;
        age2Guess = Generator.genAge2Guess(generator);
        System.out.println("Age to guess is: " + age2Guess);
        while(contGame()){
            try{
                UserInpts.setLwr(low);
                UserInpts.setUpr(high);
                UserInpts usrInpt = userInputs();
                isInptNegative(usrInpt.getPlayerGuess());
                boolean status = guessStatus(usrInpt, age2Guess);
                totalGuesses++;
                if (status){
                    System.out.println("You guessed the age in " + totalGuesses + " guesses.");
                    System.out.println("Would you like to play again? (y/n)");
                    sc.nextLine();
                    String answer = sc.nextLine();
                    if(answer.equals("y")){
                        System.out.println("Enter the lower and upper limit of the age: ");
                        low = sc.nextInt();
                        high = sc.nextInt();
                        generator = new Generator(low,high);
                        age2Guess = Generator.genAge2Guess(generator);
                        System.out.println("Age to guess is: " + age2Guess);
                        totalGuesses = 0;
                    }else{
                        System.out.println("Goodbye!");
                        gameContinue = false;
                    }
                }
            }catch (UsrInputException usrInptEx){
                System.out.println(usrInptEx.getMessage());
                System.out.println("Would you like to try again? (y/n)");
                sc.nextLine();
                String answer = sc.nextLine();
                if(answer.equals("y")){
                    System.out.print("Please enter a Integer value: ");
                }else{
                    System.out.println("Goodbye!");
                    gameContinue = false;
                }
            }
        }

    }

    private static UserInpts userInputs(){
        int lwr = zad4.UserInpts.getLwr();
        int upr = zad4.UserInpts.getUpr();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Integer value: ");
        try{
            UserInpts plyrGuess = new UserInpts();
            plyrGuess.setPlayerGuess(scanner.nextInt());
            return plyrGuess;
        }catch (InputMismatchException inptMissEx){
            System.out.println("Wrong input -> only integers are allowed :)");
            System.out.println("Would you like to try again? (y/n)");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if(answer.equals("y")){
                System.out.print("Please enter a Integer value: ");
            }else{
                System.out.println("Goodbye!");
                gameContinue = false;
            }
        }
        return null;
    }

    private static void isInptNegative(int inpt) throws UsrInputException {
        if(inpt < 0){
            throw new UsrInputException("You entered a negative number!");
        }
    }

    private static boolean contGame(){
        return gameContinue;
    }

    private static boolean guessStatus(UserInpts usrInpt, int num2Guess){
        int usrGuess = usrInpt.getPlayerGuess();
        int num2Guess1 = num2Guess;
        if(usrGuess == num2Guess1) {
            System.out.println("You guessed the number!");
            UserInpts.setStatus(true);
            return UserInpts.isStatus();
        }else {
            if (num2Guess > usrGuess) {
                System.out.println("Your guess is too low!");
                UserInpts.setStatus(false);
                return UserInpts.isStatus();
            } else {
                System.out.println("Your guess is too high!");
                UserInpts.setStatus(false);
                return UserInpts.isStatus();
            }
        }
    }
}
