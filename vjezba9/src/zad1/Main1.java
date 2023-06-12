package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<GunSlinger> gunSlingers = new ArrayList<>();
        GunSlinger gunSlinger = new GunSlinger("Bombo", "right", true, 1989);
        GunSlinger gunSlinger1 = new GunSlinger("David", "left", false, 2002);
        gunSlingers.add(gunSlinger);
        gunSlingers.add(gunSlinger1);
        ObjectsHandling.saveObjectsToFile("vjezba9/src/zad1/file.bin", gunSlingers);
    }
}
