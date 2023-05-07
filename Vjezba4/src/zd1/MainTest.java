package zd1;

public class MainTest {

    public static void main(String[] args) {
        Semafor semafor = new Semafor();
        Haker haker = new Haker(semafor);
        semafor.trenutnoSvjetlo(2);
        haker.updatePokusaj();

    }
}
