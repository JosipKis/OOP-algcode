package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    private static List<String[]> gunSlingersRead;
    private static List<String[]> gunsCSV;
    static List<GunSlinger> reconstGuns;

    public static void main(String[] args) {
        List<GunSlinger> gunSlingers = new ArrayList<>();
        GunSlinger gunSlinger = new GunSlinger("Bombo", "right", true, 1989);
        GunSlinger gunSlinger1 = new GunSlinger("David", "left", false, 2002);
        gunSlingers.add(gunSlinger);
        gunSlingers.add(gunSlinger1);
        ObjectsHandling.saveObjectsToFile("vjezba9/src/zad1/file.bin", gunSlingers);

        ObjectsHandling.saveObjToCsvFile("vjezba9/src/zad1/CSV.csv", (ArrayList<GunSlinger>) gunSlingers);
        gunSlingersRead = ObjectsHandling.read4CSVFile("vjezba9/src/zad1/CSV.csv");
        gunsCSV = ObjectsHandling.read4CSVFile("vjezba9/src/zad1/CSV.csv");
        System.out.println("\n");
        ObjectsHandling.listAllData4File(gunsCSV);
        reconstGuns = ObjectsHandling.recreateObj4TxtFile(gunsCSV);
        // List all reconstructed objects
        System.out.println("************ Reconstruction from csv file -> all objects **************");
        checkReadContent(reconstGuns);
    }

    private static <E> void checkReadContent(List<E> lst) {
        lst.forEach(T -> {
            System.out.println("\n");
            System.out.println(T.hashCode()); // added for the sake of objects distinctions
            System.out.println(T.toString());

        });
    }
}
