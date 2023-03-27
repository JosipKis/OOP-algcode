package zd2;

import java.util.Scanner;

public class Zd2_1 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Molim unesite neku intager vrijednost: \t");
		int broj = unos.nextInt();
		
		int kvadrat = broj*broj;
		int kub = broj*broj*broj;
		
		System.out.println("Kvadrat broja "+ broj +" jest "+ kvadrat+ "!");
		System.out.println("Kub broja "+ broj+ " jest "+ kub+ "!");
		
		unos.close();
	}

}
