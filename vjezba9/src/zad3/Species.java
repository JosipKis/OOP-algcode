package zad3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Species {

    private String species;

    public Species(){
        species = genSpecies();
    }

    public static Species valueOf(String s) {
        Species species = new Species();
        species.species = s;
        return species;
    }

    private String genSpecies(){
        String[] species = {"Gungan", "Kaminoans", "Wookie", "Hutt", "Zabrak", "Geonosians"};
        int rnd = ThreadLocalRandom.current().nextInt(0, species.length);
        return species[rnd];
    }

    @Override
    public String toString() {
        return "Species{" +
                "species='" + species + '\'' +
                '}';
    }
}
