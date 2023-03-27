package zd4;

import java.util.Scanner;

public class Zadatak4_5 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neko ime (String): ");
		String str = unos.nextLine();
		switch(str) {
		case "ana": System.out.println("Vrijednost je "+ str); break;
		case "ivan": System.out.println("Vrijednost je "+ str); break;
		case "matija": System.out.println("Vrijednost je "+ str); break;
		default: System.out.println("Niste naveli vrijednost za niti jedan slucaj!");
		}
	}

}
