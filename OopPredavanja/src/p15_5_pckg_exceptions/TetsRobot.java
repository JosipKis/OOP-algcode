package p15_5_pckg_exceptions;

import java.util.ArrayList;
import java.util.List;

public class TetsRobot {

    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new IndustrialRobot("Pero"));
        robots.add(new HomeAssistantRobot("Jamal"));
        robots.add(new IndustrialRobot("WWWQq"));
        robots.add(new IndustrialRobot("NME100"));
    }
}
