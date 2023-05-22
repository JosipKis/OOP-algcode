package predavanje_22_5_Serial_Deserial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestSpaceProgram {

    public static void main(String[] args) {
        StarShip starShip1 = new StarShip("Enterprise");
        System.out.println(starShip1);
        StarShip starShip2 = new StarShip("Apollo 10");
        StarShip starShip3 = new StarShip("Millennium Falcon");
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("spaceProg1.bin"))){
//            oos.writeObject(starShip1);
//            oos.writeObject(starShip2);
//            oos.writeObject(starShip3);
//            System.out.println("Success - all objects are written into file.");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        ArrayList<StarShip> ships = new ArrayList<>();
        ships.add(starShip1);
        ships.add(starShip2);
        ships.add(starShip3);
//        writeShips2File("spaceProg1.bin", ships);
        SerDeserial.saveObjects2File("spaceProgram.bin", ships);
        List<StarShip> ships2 = SerDeserial.readObjectsFromFile("spaceProgram.bin");
        System.out.println(ships2);
    }

    private static void writeShips2File(String fileName, ArrayList<StarShip> ships){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream((fileName)))){
            for (StarShip ship: ships){
                oos.writeObject(ship);
            }
            System.out.println("All ships are stored into the file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
