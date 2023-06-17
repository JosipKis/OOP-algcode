package zad4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataHandling {

    public static List<String[]> read4CSVFile(String fullPath) {

        List<String[]> data = new ArrayList<String[]>();
        File file = new File(fullPath);
        String[] rowData;
        String lnRow;
        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            while ((lnRow = br.readLine()) != null) {
                rowData = lnRow.split("\\s*,\\s*");
                data.add(rowData);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String[] getColumnData(int col, List<String[]> data4CSV) {
        String[] colData = new String[data4CSV.size()-1];
        int cnt  = 0;
        for(String[] row: data4CSV) {
            if(data4CSV.indexOf(row) == 0) {
                continue;
            } else {
                colData[cnt] = row[col];
                cnt++;
            }
        }
        return colData;
    }

    public static Set<String> getUniques(String[] data){
        Set<String> uniques = new TreeSet<>();
        uniques.addAll(Arrays.asList(data));
        return uniques;
    }

    public static Map<String, List<String[]>> returnAll4Unique(Set<String> uniques, List<String[]> rowDta, int col){
        Map<String, List<String[]>> allDta = new TreeMap<>();
        List<String[]> subDta;
        for (String key : uniques) {
            subDta = new ArrayList<>();
            for (String[] strings : rowDta) {
                if(key.equals(strings[col])) {
                    subDta.add(strings);
                } else {
                    continue;
                }
            }
            allDta.put(key, subDta);
        }
        return allDta;
    }

    public static void listAllData(Map<String, List<String[]>> dta) {
        for(String key : dta.keySet()) {
            System.out.println("--- " + key + ": ");
            for(String[] subdta : dta.get(key)) {
                System.out.println(Arrays.toString(subdta));
            }
            System.out.println("\n");
        }
    }
}