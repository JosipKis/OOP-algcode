package predavanje_22_5_Serial_Deserial;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class StarShip implements Serializable {

    private static final int MAXMISS = 75;
    private static final int MINMISS = 1;

    private String name;
    private int id;
    private static int cntID = 10;

    private int numMissions;
    private LocalDate firstMissionDate;

    public StarShip(String name){
        this.name = name;
        this.id = cntID++;
        generateMissions();
        rndFirstMissionDate();
    }

    private void generateMissions(){
        this.numMissions = ThreadLocalRandom.current().nextInt(MINMISS, MAXMISS + 1);
    }

    private void rndFirstMissionDate(){
        LocalDate startDate = LocalDate.of(2001, 1, 1);
        long start = startDate.toEpochDay();
        LocalDate endDate = LocalDate.now();
        long end = endDate.toEpochDay();
        long rndDate = (long) (start + (end - start) * Math.random());
        this.firstMissionDate = LocalDate.ofEpochDay(rndDate);
    }

    @Override
    public String toString() {
        return "StarShip{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", numMissions=" + numMissions +
                ", firstMissionDate=" + firstMissionDate +
                '}';
    }
}
