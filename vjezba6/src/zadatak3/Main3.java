package zadatak3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main3 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        fillingSets(hashSet);
        System.out.println("********** HashSet **********");
        printEverySetElement(hashSet);
        checkForElement(hashSet);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        fillingSets(linkedHashSet);
        System.out.println("********** LinkedHashSet **********");
        printEverySetElement(linkedHashSet);
        checkForElement(linkedHashSet);
        TreeSet<String> treeSet = new TreeSet<>();
        fillingSets(treeSet);
        System.out.println("********** TreeSet **********");
        printEverySetElement(treeSet);
        checkForElement(treeSet);

    }

    private static void fillingSets(Set<String> set){
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
    }

    private static void checkForElement(Set<String> set){
        if (set.contains("Nema ga")){
            System.out.println("Found the element 'Nema ga' in the Set!");
        }else {
            System.out.println("Element 'Nema ga' is not in the Set...");
            System.out.println("Adding the element now...");
            set.add("Nema ga");
            System.out.println("_____________ Updated Set _____________");
            printEverySetElement(set);
        }
    }

    private static void printEverySetElement(Set<String> set){
        for (String str: set){
            System.out.println(str) ;
        }
    }
}
