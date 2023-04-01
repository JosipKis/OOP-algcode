package zadatak8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class DoubleProcessing {
	private static final double MINDOUBLE = 0.0;
	private static final double MAXDOUBLE = 2000.0;

	public static Double[] generateDoubleArr(int numElements) {
		
		Double[] genArrDouble = new Double[numElements];
		for (int k = 0; k < numElements; k++) {
			Double rndDouble = ThreadLocalRandom.current().nextDouble(MINDOUBLE, MAXDOUBLE);
			// generira nasumičnu double vrijednost!
			genArrDouble[k] =  rndDouble;
		}
		System.out.println("Finsihed generating...");
		System.out.println(Arrays.toString(genArrDouble));
		return genArrDouble;
	}
	
	public static void printAndSort(Double[] dArr) {
		System.out.println("Unsorted: ");
		System.out.println(Arrays.toString(dArr));
		Arrays.sort(dArr); // uzlazno sortirano
		System.out.println("Sorted ascending:");
		System.out.println(Arrays.toString(dArr));
		//Arrays.sort(dArr, new ComparatorDescendingDouble());
		System.out.println("Sorted descending...");
		Comparator<Double> doubleComparator= Collections.reverseOrder();
		Arrays.sort(dArr, doubleComparator);
		System.out.println(Arrays.toString(dArr));
		}
	}
	
	class ComparatorDescendingDouble implements Comparator<Double>{

		@Override
		public int compare(Double o1, Double o2) {
			return 02;
		}
		{
	}
}
