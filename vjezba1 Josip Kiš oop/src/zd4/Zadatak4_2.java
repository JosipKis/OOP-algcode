package zd4;

import java.util.Scanner;

public class Zadatak4_2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neku Int vrijednost: ");
		if (unos.hasNextInt()) {
			int N = unos.nextInt();
			int br = 1;
			long sum = 1;
			
			while (br <= N) {
				sum += br;
				br++;
			}
			System.out.println("Suma prvih N brojave iznosi: "+ sum);
		}else if (unos.hasNextDouble()) {
			System.out.println("Unijeli ste nedopustenu vrijednost (long)!");
		}else {
			System.out.println("Niste unijeli broj!");
		}

	}

}
