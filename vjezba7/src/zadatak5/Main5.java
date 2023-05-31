package zadatak5;

import java.util.Iterator;
import java.util.LinkedList;

public class Main5 {

    public static void main(String[] args) {
        LinkedList<String> vehicles = new LinkedList<>();
        vehicles.add("car");
        vehicles.add("helicopter");
        vehicles.add("electronic bike");
        vehicles.add("truck");
        vehicles.add("motorcycle");
        vehicles.add("carriage");
        printList(vehicles);
        System.out.println("\n");
        Iterator<String> iterator = vehicles.iterator();
        System.out.println("Printing elements from the LinkedList by while loop and an iterator...\n");
        while (iterator.hasNext()){
            String itr = iterator.next();
            System.out.println(itr + " ");
            if ("carriage".equals(itr)){
                vehicles.remove("carriage");
            }
        }
        System.out.println("\n");
        System.out.println("Printing the LinkedList after the while loop...");
        printList(vehicles);
        System.out.println("\n");
        ListProcessing.insertVeh(vehicles);
        System.out.println("\n");
        printList(vehicles);

    }

    private static void printList(LinkedList<String> linkedList){
        System.out.println("Printing elements from the LinkedList by for each loop...\n");
        for (String str: linkedList){
            System.out.println(str);
        }
    }
}
