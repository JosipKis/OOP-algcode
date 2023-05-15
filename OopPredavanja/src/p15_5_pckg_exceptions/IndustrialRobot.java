package p15_5_pckg_exceptions;

public class IndustrialRobot extends Robot{

    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    protected void performSomeAction() {
        System.out.println(getClass().getSimpleName() +" performing some special action...");
    }
}
