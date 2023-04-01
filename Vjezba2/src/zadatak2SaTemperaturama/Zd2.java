package zadatak2SaTemperaturama;

import java.util.Arrays;
import java.util.Scanner;

public class Zd2 {
	
	static Scanner unos = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Unesite broj clanova liste: ");
		int brClanova = unos.nextInt();
		double[] clanovi = new double[brClanova];
		elNiza(brClanova, clanovi);
		prosjekTemp(clanovi, brClanova);
	}
	
	private static void elNiza(int brEl, double[] lista) {
		System.out.println("Unesite temperature: ");
		for (int c = 0; c < brEl; c++) {
			lista[c] = unos.nextDouble();
		}
		System.out.println(Arrays.toString(lista));
	}
	
	private static void prosjekTemp(double[] lista, int brEl) {
		double temp = 0;
		double prosjecnaTemp = 0;
		for (double c: lista) {
			temp += c;
		}
		prosjecnaTemp = temp/brEl;
		System.out.println("Prosjecna temperatura iznosi: "+ prosjecnaTemp);
		for (double c: lista) {
			if (c > prosjecnaTemp) {
				System.out.println(c +" je visa temeratura od prosjecne!");
			}else {
				System.out.println(c +" je niza temperatura od prosjecne!");
			}
		}
	}
}
