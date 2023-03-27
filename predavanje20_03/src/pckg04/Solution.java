package pckg04;

import java.util.Arrays;
import java.util.Scanner;

//vj2 zd1

public class Solution {
	
	//sve što je unutar klase metodama je vidljivo!
	
	private static Scanner scanner;

	public static void main(String[] args) {

		String[] strArr = {"Ass", "ti", "miša..."};
		scanner = new Scanner(System.in);
		String[] arr = userGeneratedStringArr(5);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	private static String[] userGeneratedStringArr(int numElements) {
		String[] strArr = new String[numElements];
		for (int k = 0; k < numElements; k++) {
			System.out.println("Unesite jedan string...");
			String unos = scanner.nextLine();
			strArr[k] = unos;
		}
		System.out.println("Gotovo!");
		return strArr;
	}
}
