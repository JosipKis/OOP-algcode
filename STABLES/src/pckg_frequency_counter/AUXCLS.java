package pckg_frequency_counter;

import java.io.File;

public class AUXCLS {

    public static boolean fileExists(String filePath){
        File file = new File(filePath);
        boolean exists = file.exists();
        System.out.println("File exists: "+ exists);
        System.out.println("File path: "+ filePath);

        return false; // change to final version
    }
}
