package predavanje_22_5_Serial_Deserial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerDeserial {

    /**
     * This method saves into bin file any list of objects
     * @param fileName
     * @param elements
     * @param <E> any class that implements Serializable
     * @see java.io.Serializable
     */
    public static <E> void saveObjects2File(String fileName, List<E> elements){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((fileName)))){
            for (E element: elements){
                oos.writeObject(element);
            }
            System.out.println("All ships are stored into the file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // pass by reference (watch a tutorial)
    public static <E> List<E> readObjectsFromFile(String fileName){
        List<E> elementsFromFile = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            while (true){
                E element = (E) ois.readObject();
                elementsFromFile.add(element);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException eof){
            System.out.println("End of file was reached!");
            System.out.println("All objects from file are stored in data structure!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return elementsFromFile;
    }
}
