package zad1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class GunSlinger implements Serializable {

    private String name;
    private LocalDate dob;
    private int duels;
    private String strongHand;
    private boolean twoGuns;

    public GunSlinger(String name){
        this.name = name;
    }

    public GunSlinger(String name, String strongHand, boolean twoGuns, int yr){
        this.name = name;
        this.strongHand = strongHand;
        this.twoGuns = twoGuns;
        duels = genDuelsWon()   ;
        this.dob = genDOB(yr);
    }

    private LocalDate genDOB(int year){
        LocalDate birth;
        LocalDate startDate = LocalDate.of(year, 9, 8);
        long start = startDate.toEpochDay();
        int rndYear = ThreadLocalRandom.current().nextInt(year + 20, year + 45);
        LocalDate endDate = LocalDate.of(rndYear, 9, 8);
        long end = endDate.toEpochDay();
        long dobs = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        birth = LocalDate.ofEpochDay(dobs);
        return birth;
    }

    private int genDuelsWon(){
        int totalDuels = ThreadLocalRandom.current().nextInt(1, 69);
        int wonDuels = 0;
        for (int c = 0; c < totalDuels; c++){
            int winOrLose = ThreadLocalRandom.current().nextInt(0, 2);
            if (winOrLose == 0){

            }else {
                wonDuels += 1;
            }
        }
        System.out.println("Out of the "+ totalDuels +" duels, the gunslinger won "+ wonDuels);
        return wonDuels;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getDuels() {
        return duels;
    }

    public String getStrongHand() {
        return strongHand;
    }

    public boolean isTwoGuns() {
        return twoGuns;
    }

    @Override
    public String toString() {
        return "GunSlinger{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", duels=" + duels +
                ", strongHand='" + strongHand + '\'' +
                ", twoGuns=" + twoGuns +
                '}';
    }
}
