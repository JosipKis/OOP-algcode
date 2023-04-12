package packsll;

public class TestSLL {

	public static void main(String[] args) {

//		Node<Integer> node1 = new Node(10, null);
//		System.out.println(node1);
//		Node<Integer> node2 = new Node<>(100, node1);
//		System.out.println();
        SLL_Concrete<Integer> sll = new SLL_Concrete<>();
        System.out.println(sll);
        sll.addFirst(10);
        System.out.println(sll);

        sll.addFirst(110);
        System.out.println(sll);

        sll.addFirst(1110);
        System.out.println(sll);



        sll.addLast(-1000);
        System.out.println(sll);

        System.out.println("=========================");
//        Integer element = sll.removeFirst();
//        System.out.println("Removed: "+ element);
//        System.out.println(sll);

//        Integer el = sll.removeFirst();
//        Integer els = sll.removeFirst();
//        Integer elsi = sll.removeFirst();
//        System.out.println(sll);
//        Integer sls = sll.removeFirst();


//        Integer k = sll.removeLast();
//        System.out.println("Removed: "+k);
//        System.out.println(sll);
//        boolean ce = sll.containsElement(50);
//        System.out.println("Contains: "+ ce);
        
//        Node<Integer> val = new Node<>(100, null);
//        Node<Integer> abb = new Node<>(100, null);
//        Node<Integer> cp = val;
//        if (val == cp) {
//        	System.out.println("Jednaki su!");
//        }else {
//        	System.out.println("Nisu jednaki!");
        
        sll.insertAtPosition(1234, 2);
        System.out.println("Size: "+ sll.size());
        sll.insertAtPosition(2323232, 5);
        System.out.println(sll);
//        }
	}

}

// Za domaći kreirati double linked listu! (u novom paketu, povuci i Node)
