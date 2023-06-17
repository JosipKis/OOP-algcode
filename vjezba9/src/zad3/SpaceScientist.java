package zad3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceScientist implements Serializable {

    private String name;
    private int id;
    private static int cntID = 10;
    private String specialization;
    private ArrayList<String> equipment;
    private Species spec;

    public SpaceScientist(String name){
        this.name = name;
    }

    public SpaceScientist(String name, int id, String specialization, Species spec){
        this.name = name;
        this.equipment = genEquipment();
        this.id = cntID++;
        this.specialization = specialization;
        this.spec = spec;
    }

    public ArrayList<String> genEquipment() {
        equipment = new ArrayList<>();
        String[] equipmentList = {"Scanner", "Scalpel", "Tweezers", "Portable computer", "Gas-mask"};
        for (int c = 0; c < 3; c++){
            int rnd = ThreadLocalRandom.current().nextInt(0, equipmentList.length);
            equipment.add(equipmentList[rnd]);
        }
        return equipment;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getCntID() {
        return cntID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public Species getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "SpaceScientist{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", specialization='" + specialization + '\'' +
                ", equipment=" + equipment +
                ", spec=" + spec +
                '}';
    }
}
