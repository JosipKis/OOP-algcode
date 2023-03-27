package zd4;

import java.util.Scanner;

public class Zadatak4_7 {

	public static void main(String[] args) {
		
		String dobra = "dobro";
		String bolja = "bolje";
		String najbolja = "najbolja";
		String sad = "lose";
		Scanner unos = new Scanner(System.in);
		System.out.println("Kako se osjecate danas?");
		String str = unos.nextLine();
		switch (str) {
		case "dobro": System.out.println("Hvala, danas sam "+ dobra); break;
		case "bolje": System.out.println("Hvala, danas sam "+ bolja); break;
		case "najbolje": System.out.println("Hvala, danas sam "+ najbolja); break;
		case "lose": System.out.println("Sigurno ce biti bolje :)"); break;
		default: System.out.println("Ne prepoznajem tu emociju :(");
		}
	}

}
