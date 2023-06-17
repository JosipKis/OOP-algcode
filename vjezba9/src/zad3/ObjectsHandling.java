package zad3;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsHandling {

    public static <E> void saveObjectsToFile(String filePath, E object){
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write(object.toString());
            fileWriter.write("\n");
            fileWriter.close();
            System.out.println(object.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveObjToCsvFile(String filePath, ArrayList<SpaceScientist> scientists){
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            FileWriter fileWriter = new FileWriter(filePath, true);
            for (int c = 0; c < scientists.size(); c++){
                fileWriter.write(scientists.get(c).getName() +", ");
                fileWriter.write(scientists.get(c).getId() +", ");
                fileWriter.write(scientists.get(c).getSpecialization() +", ");
                fileWriter.write(scientists.get(c).getEquipment() +", ");
                fileWriter.write(String.valueOf(scientists.get(c).getSpec()));
                fileWriter.write("\n");
                System.out.print(scientists.get(c).getName() +", ");
                System.out.print(scientists.get(c).getId() +", ");
                System.out.print(scientists.get(c).getSpecialization() +", ");
                System.out.print(scientists.get(c).getEquipment() +", ");
                System.out.print(String.valueOf(scientists.get(c).getSpec()));
                System.out.println("");
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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

    public static void listAllData4File(List<String[]> data) {
        for (String[] strings : data) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static List<SpaceScientist> recreateObj4TxtFile(List<String[]> data){
        List<SpaceScientist> ss = new ArrayList<>();
        data.forEach(row -> {
            SpaceScientist scientist;
            int cnt = 0;
            String name = row[cnt];
            System.out.println(name);
            cnt++;
            Integer id;
            try {
                id = Integer.parseInt(row[cnt]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid integer value for id: " + row[cnt]);
                return;
            }
            cnt++;
            String specialization = row[cnt];
            cnt++;
            String equipment = row[cnt];
            cnt++;
            Species spec = Species.valueOf(row[cnt]);
            SpaceScientist newScientist = new SpaceScientist(name, id, specialization, spec);
            ss.add(newScientist);
        });
        return ss;
    }
}
