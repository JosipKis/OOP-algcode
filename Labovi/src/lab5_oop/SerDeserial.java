package lab5_oop;

import java.io.*;
import java.util.*;

public class SerDeserial {

    public static void saveUsr2File(String filepath, TreeMap<Integer, User> usrs){
        try (FileOutputStream fileOutputStream = new FileOutputStream(filepath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(usrs);
            System.out.println("");
            System.out.println("All saved to the file -> UsersFile.bin");
            System.out.println("");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readUsr4File(String filepath){
        TreeMap<Integer, User> restoredTreeMap;
        try (FileInputStream fileInputStream = new FileInputStream(filepath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
             restoredTreeMap = (TreeMap<Integer, User>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("<<<<<<<<<< All from file: >>>>>>>>>>>");
        for (Integer key : restoredTreeMap.keySet()) {
            User value = restoredTreeMap.get(key);
            System.out.println(value);
        }
        // u bloku finally ispisati sve iz rekonstruirane mape
        // pogledati traženi konzolni izlaz

    }

}
