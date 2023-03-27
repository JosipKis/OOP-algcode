package zd4;

import java.util.Scanner;

/*
 * Odgovor na primjer 4_1:
 * određujemo int varijablu cnt = 1. 'while' petlja za uvjet ima da se izvrava dok je cnt manji ili 
 * jednak 10. Svako izvršavanje petlje ispisuje trenutnu vrijednost cnt-a u konzolu, a ta se 
 * vrijednost povećava za 1 svaki put kad se petlja izvrši. Dakle, imat ćemo 10 ispisa u konzoli!
 */

public class Zadatak4_1 {

	public static void main(String[] args) {
		boolean brojac = true;
		while (brojac) {
			if (volumenKugle(args) > 10) {
				
			}else {
				brojac = false;
			}
		}
	}
	private static double volumenKugle(String[] arguments) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite radijus kugle: ");
		
		double r = unos.nextDouble();
		if (r < 0) {
			System.out.println("Broj koji ste unijeli je manji od nule!");
		}else {
			double volumen = (double) (4.0/3)*Math.PI*r*r*r;
			System.out.println("Volumen kugle s unesenim radiusom je: "+ volumen);
		}
		return r;
	}
}
