package zd4;

import java.util.Scanner;

public class Zadatak4_3 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		boolean trueValue = true;
		while (trueValue) {
			System.out.println("Unesite neku int vrijednos, preporucam 158: ");
			int broj = unos.nextInt();
			if (broj != 158) {
				System.out.println("Broj koji ste unijeli je: "+ broj);
			}else {
				System.out.println("Unijeli ste broj 158! Game ended by intentional game design.");
				trueValue = false;
			}
			
			
		}
	}

}
