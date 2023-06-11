package zad4;

public class UserInpts {

    private static int lwr;
    private static int upr;
    private int playerGuess;
    private static boolean status;

    public UserInpts(){
        int guess = playerGuess;
    }

    public static void setUpr(int high) {
    }

    public static void setLwr(int low) {
    }

    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
    }

    public static void setStatus(boolean status) {
        UserInpts.status = status;
    }

    public static int getLwr() {
        return lwr;
    }

    public static int getUpr() {
        return upr;
    }

    public int getPlayerGuess() {
        return playerGuess;
    }

    public static boolean isStatus() {
        return status;
    }
}
