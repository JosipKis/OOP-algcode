package zadatak5;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListProcessing implements ListIterator {

    public static void insertVeh(LinkedList<String> linkedList){
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
            if ("electronic bike".equals(el)) {
                iterator.add("New Vehicle");
            }
        }

    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }
}
