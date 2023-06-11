package zad4;

public class UsrInputException extends Exception{

    private  int lwr;
    private  int upr;
    private  int playerGuess;
    private  String msg;

    public UsrInputException(String msg){
        super(msg);
        this.msg = msg;
    }

    public void setLwr(int lwr) {
        this.lwr = lwr;
        System.out.println("You entered: "+ lwr +" as a lower value.");
    }

    public void setUpr(int upr) {
        this.upr = upr;
        System.out.println("You entered: "+ upr +" as a upper value.");
    }

    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
        System.out.println("Your guess is: "+ playerGuess);
    }
}
