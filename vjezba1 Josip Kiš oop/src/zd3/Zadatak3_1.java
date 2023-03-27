package zd3;

import java.util.Scanner;

public class Zadatak3_1 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Molim unesite neki cijeli broj: ");
		
		if (unos.hasNextInt()) {
			/* 
			 * 'hasNextInt' za povratnu vrijednost vraca boolean ovisno o tome jeli unesen 
			 * iskljucivo integer!
			*/
			int broj = unos.nextInt();
			if (broj < 0) {
				System.out.println("Apsolutna vrijednost unesenog broja je: "+ Math.abs(broj));
			}else if (broj == 0) {
				System.out.println("Broj koji ste unijeli je nula!");
			}else {
				System.out.println("Treci korijen vaseg broja je: "+ Math.cbrt(broj));
			}	
		}else {
			System.out.println("Vas unos nije broj!");

		}
		unos.close();
	}
	
	
	

}
