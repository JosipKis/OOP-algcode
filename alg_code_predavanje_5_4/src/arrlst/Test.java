package arrlst;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

	private static final int LWR = -10;
	private static final int UPR = 100;
	
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>(10);
		createAndPopulateArrayList(lista, 5);
		System.out.println(lista);
		lista.add(lista.size(), -10);
		System.out.println(lista);
//		lista.clear();
//		System.out.println();
		boolean containsEl = lista.contains(-100);
		System.out.println("Contains "+ containsEl);
		int el = lista.get(3);
		System.out.println(el);
	}
	
	private static void createAndPopulateArrayList(ArrayList<Integer> lst, int numElements) {
		for (int k = 0; k < numElements; k++) {
			lst.add(ThreadLocalRandom.current().nextInt(LWR, UPR));
		}
		System.out.println("Finished generating a list..");
	}

}
