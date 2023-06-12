package zad1;

import java.io.*;

public class ObjectsHandling {

    public static <E> void saveObjectsToFile(String filePath, E object){
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write(object.toString());
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
