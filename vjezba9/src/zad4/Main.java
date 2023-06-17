package zad4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String[]> orgDta = DataHandling.read4CSVFile("vjezba9/src/zad4/datCSV.csv");
        String[] colData;
        System.out.println(Arrays.toString(orgDta.toArray()));
        colData = DataHandling.getColumnData(0, orgDta);
        for (String string : colData) {
            System.out.println(string);
        }
        Set<String> uniques = DataHandling.getUniques(colData);
        System.out.println("\n");
        for (String string : uniques) {
            System.out.println(string);
        }

        Map<String, List<String[]>> data = new HashMap<>();
        data = DataHandling.returnAll4Unique(uniques, orgDta, 0);
        System.out.println("\n\n");
        DataHandling.listAllData(data);
    }



}
