package zadatak1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ja");
        arrayList.add("sam");
        arrayList.add("Josip");
        arrayList.add("Kiš");
        arrayList.add("... ");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        System.out.println("------Array List------");
        System.out.println(arrayList);
        System.out.println("------Linked List------");
        System.out.println(linkedList);
        linkedList.add(0, "Dobar dan! ");
        linkedList.add(linkedList.size(), "Aj bok!");
        System.out.println("------Linked List after adding idx 0 and last idx elements------");
        for (int c = 0; c < linkedList.size(); c++){
            System.out.println(linkedList.get(c));
        }
        System.out.println("------List after changing the element------");
        changeElement(3, linkedList, "Willi");
    }

    public static void changeElement(int indx, LinkedList<String> llist, String newElement){
        try{
            llist.set(indx, newElement);
            System.out.println(llist);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Entered index is out of bounds!");
        }
    }
}
