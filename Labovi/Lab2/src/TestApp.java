import java.util.ArrayList;
import java.util.Arrays;
public class TestApp {

// dobro proučiti priloženi api!!!
public static void main(String[] args) {
    // generirati deset indeksnih pozicija korištenjem pomoćne klase
    int[] indxs = AUX_CLS_01.genIndices(10);
    // ispis generiranih indeksa
    System.out.println(Arrays.toString(indxs));
    // stvaranje liste automobila temeljem generiranih indeksa
    ArrayList<Car> cars = AUX_CLS_01.genSomeCars(indxs);
    // ispis info podataka za sve automobile iz slite -> trebaju svi imati odometar na nuli
    AUX_CLS_01.getAllInfo(cars);
    System.out.println("-----------------------------------------------------------------------------------------");
    // update svih automobila - njihovh odometara
    AUX_CLS_01.updateAll(cars, indxs, 3000);
    // opet info za sve
    AUX_CLS_01.getAllInfo(cars);
    }
}
