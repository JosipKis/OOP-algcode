package zad2;

public class Calculation {

    private float kredit;
    private float kamata;
    private int nacin;
    private int godina;
    private double total;

    public Calculation(float kredit, float kamata, int godina, int nacin) {
        this.kredit = kredit;
        this.kamata = kamata;
        this.godina = godina;
        this.nacin = nacin;
        this.total = calculate(this.kredit, this.kamata, this.godina, this.nacin);
    }

    public static double calculate(float kredit, float kamata, int godina, int nacin){
        double total;
        int nacinInt;
        if (nacin == 1){
            nacinInt = 12;
        } else nacinInt = 4;
        float intr = (kamata / 100) / nacinInt;
        int nacinn = godina*12;
        double doublen = (Math.pow((1+intr), nacinn)-1) / (intr*Math.pow((1+intr),nacinn));
        total = kredit / doublen;
        return total;
    }

    @Override
    public String toString() {
        return "Credit=" + kredit +
                "\nkamata?=" + kamata +
                "\nmethod=" + nacin +
                "\nyears=" + godina +
                "\ntotal=" + total;
    }
}