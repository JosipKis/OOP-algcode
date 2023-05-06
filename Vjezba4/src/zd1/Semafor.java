package zd1;

public class Semafor {
    private String crveno = "0";
    private String zuto = "2";
    private String zeleno = "1";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
    }

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
    }

    public void trenutnoSvjetlo(int broj){
        String svjetlo = String.valueOf(broj);
        System.out.println("Trenutno stanje semafora: ");
        if (svjetlo.equals(crveno)){
            System.out.println(ANSI_RED +"0 - Crveno!"+ ANSI_RESET);
        }else if (svjetlo.equals(zuto)){
            System.out.println(ANSI_YELLOW +"2 - Zuto!"+ ANSI_RESET);
        }else if (svjetlo.equals(zeleno)){
            System.out.println(ANSI_GREEN +"1 - Zeleno!"+ ANSI_RESET);
        }else {
            System.out.println("Semafor ne poznaje ovu vrijednost :(");
        }
    }
}
