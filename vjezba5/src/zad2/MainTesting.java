package zad2;

public class MainTesting {


    public static void main(String[] args) {
        Person person1 = new Person("Josip", "08-09-2002");
        person1.talk("To be or not to be?");
        person1.walk("East", 25);
        person1.think("Life");
        System.out.println(person1.calculate(17));
        person1.infoPerson();
        System.out.println("----------------------------------------------");
        Robot robot = new Robot();
        robot.setName("X-AE 12");
        robot.setId(420);
        robot.setDoc("08-09-2077");
        robot.talk("Say something!");
        robot.walk("Nort-East", 12);
        robot.think("Shakespeare");
        System.out.println("********** beep-boop **********");
        System.out.println(robot.calculate(3));
        robot.infoRobot();
    }
}
