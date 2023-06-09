package vjezba3;

public class Main {

    private static SLIST<Integer> slist;
    public static void main(String[] args) {

        Node<Integer> node1 = new Node<>(10, null);
        Node<Integer> node2 = new Node<>(100, node1);
        System.out.println(node2);
        slist = new SLIST<>();
        slist.addFirst(10);
        slist.addFirst(20);
        System.out.println(slist);
        slist.addLast(30);
        slist.addLast(40);
        System.out.println(slist);
//        slist.clear();
//        System.out.println(slist);
//        testRemoveLast(slist);
//        testRemoveFirst(slist);
        slist.insert(2, -123);
        System.out.println(slist);
        slist.insert(0, -1000);
        System.out.println(slist);
        slist.insert(slist.size(), -5000);
        System.out.println(slist);
//        slist.insert(slist.size()+1, -30000);
        int element = slist.remove(0);
        System.out.println("Removed element: " + element);
        System.out.println(slist);
        int element1 = slist.remove(slist.size()-1);
        System.out.println("Removed element: " + element1);
        System.out.println(slist);
        int element2 = slist.remove(slist.size()/2);
        System.out.println("Removed element: " + element2);
        System.out.println(slist);
        System.out.println("Contains 30: " + slist.contains(30));
        System.out.println("Contains 100: " + slist.contains(100));
    }

    private static void testRemoveLast(SLIST<Integer> slist) {
        while(!slist.isEmpty()) {
            System.out.println("Remove last element: " + slist.removeLast());
            System.out.println(slist);
        }
    }

    private static void testRemoveFirst(SLIST<Integer> slist) {
        while(!slist.isEmpty()) {
            System.out.println("Remove first element: " + slist.removeFirst());
            System.out.println(slist);
        }
    }
}