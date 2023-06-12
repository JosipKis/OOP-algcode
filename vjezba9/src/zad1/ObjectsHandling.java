package zad1;

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

    public static void saveObjToCsvFile(String filePath, ArrayList<GunSlinger> gunSlingers){
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            FileWriter fileWriter = new FileWriter(filePath, true);
            for (int c = 0; c < gunSlingers.size(); c++){
                fileWriter.write(gunSlingers.get(c).getName() +", ");
                fileWriter.write(gunSlingers.get(c).getDob() +", ");
                fileWriter.write(gunSlingers.get(c).getDuels() +", ");
                fileWriter.write(gunSlingers.get(c).getStrongHand() +", ");
                fileWriter.write(String.valueOf(gunSlingers.get(c).isTwoGuns()));
                fileWriter.write("\n");
                System.out.print(gunSlingers.get(c).getName() +", ");
                System.out.print(gunSlingers.get(c).getDob() +", ");
                System.out.print(gunSlingers.get(c).getDuels() +", ");
                System.out.print(gunSlingers.get(c).getStrongHand() +", ");
                System.out.print(String.valueOf(gunSlingers.get(c).isTwoGuns()));
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

    public static List<GunSlinger> recreateObj4TxtFile(List<String[]> data){
        List<GunSlinger> guns = new ArrayList<>();
        data.forEach(row -> {
            GunSlinger gunSlinger;
            int cnt = 0;
            String name = row[cnt];
            System.out.println(name);
            cnt++;
            DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dob;
            try {
                dob = LocalDate.parse(row[cnt], dobFormatter);
            } catch (DateTimeParseException e) {
                System.err.println("Invalid date format for dob: " + row[cnt]);
                return;
            }
            cnt++;
            Integer duels;
            try {
                duels = Integer.parseInt(row[cnt]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid integer value for duels: " + row[cnt]);
                return;
            }
            cnt++;
            String strongHand = row[cnt];
            cnt++;
            boolean twoGuns = Boolean.parseBoolean(row[cnt]);
            gunSlinger = new GunSlinger(name);
            gunSlinger.setDob(dob);
            gunSlinger.setDuels(duels);
            gunSlinger.setStrongHand(strongHand);
            gunSlinger.setTwoGuns(twoGuns);
            guns.add(gunSlinger);
        });


        return guns;
    }
}
