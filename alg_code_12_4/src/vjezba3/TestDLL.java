package vjezba3;

public class TestDLL {

    public static void main(String[] args) {
//        DNODE<Integer> dnode1 = new DNODE<>(100, null, null);
//        DNODE<Integer> dnode2 = new DNODE<>(200, null, null);
//        DNODE<Integer> dnode3 = new DNODE<>(300, null, null);
//
//        System.out.println(dnode1);
//        dnode2.setPrev(dnode1);
//        dnode1.setNext(dnode2);
//        System.out.println(dnode1);
//        dnode2.setNext(dnode3);
//        dnode3.setPrev(dnode2);
//        System.out.println(dnode1);

        DLIST<Integer> dlist = new DLIST<>();
        dlist.addLast(100);
        dlist.addLast(200);
        dlist.addLast(300);
        System.out.println(dlist);
        dlist.addFirst(30);
        dlist.addFirst(20);
        dlist.addFirst(10);
        System.out.println(dlist);
        dlist.insert(3, -1000);
        System.out.println(dlist);
        dlist.insert(0, 25000);
        dlist.insert(dlist.size(), -25000);
        System.out.println(dlist);
        dlist.remove(0);
        System.out.println(dlist);
        dlist.remove(dlist.size() - 1);
        System.out.println(dlist);
        dlist.remove(3);
        System.out.println(dlist);
//        dlist.clear();
//        System.out.println(dlist);
        System.out.println("List contains 200: " + dlist.contains(200));
        System.out.println("List contains -300: " + dlist.contains(-300));
        System.out.println(dlist);
        dlist.insertAt(0,-1000);
        System.out.println(dlist);
        dlist.insertAt(dlist.size(), -2000);
        System.out.println(dlist);
        dlist.insertAt(3, -3000);
        System.out.println(dlist);

    }
}
