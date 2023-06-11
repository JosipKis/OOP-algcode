package zad4;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    private final int LOW;
    private final int HIGH;

    public Generator(int low, int high){
        this.LOW = low;
        this.HIGH = high;
    }

    public static int genAge2Guess(Generator generator){
        int genAge = ThreadLocalRandom.current().nextInt(generator.getLOW(), generator.getHIGH());
        return genAge;
    }

    public  int getLOW() {
        return LOW;
    }

    public  int getHIGH() {
        return HIGH;
    }


}
