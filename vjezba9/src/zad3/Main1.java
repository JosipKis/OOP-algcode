package zad3;

import zad1.GunSlinger;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    private static List<String[]> scientistsRead;
    private static List<String[]> scientistsCSV;
    static List<SpaceScientist> reconstScientists;


    public static void main(String[] args) {
        List<SpaceScientist> scientists = new ArrayList<>();
        Species alien = new Species();
        scientists.add(new SpaceScientist("John"));
        scientists.add(new SpaceScientist("Jane", 10, "Biologist", alien));
        ObjectsHandling.saveObjectsToFile("vjezba9/src/zad3/file.bin", scientists);

        ObjectsHandling.saveObjToCsvFile("vjezba9/src/zad3/CSV.csv", (ArrayList<SpaceScientist>) scientists);
        scientistsRead = ObjectsHandling.read4CSVFile("vjezba9/src/zad3/CSV.csv");
        scientistsCSV = ObjectsHandling.read4CSVFile("vjezba9/src/zad3/CSV.csv");
        System.out.println("\n");
        ObjectsHandling.listAllData4File(scientistsCSV);
        reconstScientists = ObjectsHandling.recreateObj4TxtFile(scientistsCSV);
        System.out.println("************ Reconstruction from csv file -> all objects **************");
        checkReadContent(reconstScientists);
    }

    private static <E> void checkReadContent(List<E> lst) {
        lst.forEach(T -> {
            System.out.println("\n");
            System.out.println(T.hashCode());
            System.out.println(T.toString());
        });
    }
}
