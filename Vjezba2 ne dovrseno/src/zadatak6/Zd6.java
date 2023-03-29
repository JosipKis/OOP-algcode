package zadatak6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zd6 {
	
	static final int  MIN = 1;
	static final int MAX = 101;

	public static void main(String[] args) {

		int[] niz = new int[15];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);
			System.out.println(niz[i]);
		}
		int[] kopija = Arrays.copyOf(niz, 15);
		if (niz.equals(kopija)) {
			System.out.println("Originalni niz je jednak kopiji!");
		}else {
			System.out.println("Originalni niz i kopija su razliciti.");
		}
		
		
	}

}
