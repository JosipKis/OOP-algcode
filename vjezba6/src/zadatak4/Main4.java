package zadatak4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        Robot robot1 = new Robot("Worker robot", 13);
        Robot robot2 = new Robot("The Terminator", 800);
        Robot robot3 = new Robot("Protocol droid", 7);
        Robot robot4 = new Robot("Military robot", 250);
        Robot robot5 = new Robot("Ash", 1979);
        Robot robot6 = new Robot("Police robot", 209);
        Robot robot7 = new Robot("Second Generation Robotic Droid Series-2", 9001);
        LinkedHashMap<Integer, String> robotMap = new LinkedHashMap<>();
        robotMap.put(robot1.getId(), robot1.getDescription());
        robotMap.put(robot2.getId(), robot2.getDescription());
        robotMap.put(robot3.getId(), robot3.getDescription());
        robotMap.put(robot4.getId(), robot4.getDescription());
        robotMap.put(robot5.getId(), robot5.getDescription());
        robotMap.put(robot6.getId(), robot6.getDescription());
        robotMap.put(robot7.getId(), robot7.getDescription());

        LinkedHashSet<Object> setOfRobots = new LinkedHashSet<>();
        setOfRobots.add(robot1);
        setOfRobots.add(robot2);
        setOfRobots.add(robot3);
        setOfRobots.add(robot4);
        setOfRobots.add(robot5);
        setOfRobots.add(robot6);
        setOfRobots.add(robot7);
        System.out.println("*************** Linked Hash Map ***************");
        printOutMap(robotMap);
        robotMap.put(robot7.getId(), robot7.getDescription());
        System.out.println("------------ After adding robot7 twice ------------");
        printOutMap(robotMap);
        System.out.println("*************** Linked Hash Set ***************");
        printOutSet(setOfRobots);
        setOfRobots.add(robot7);
        System.out.println("------------ After adding robot7 twice ------------");
        printOutSet(setOfRobots);

    }

    private static void printOutMap(Map<?, ?> map){
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Robot ID= "+ key +", description= "+ value);
        }
    }

    private static void printOutSet(Set<?> set){
        for (Object object: set){
            System.out.println(object);
        }
    }

}