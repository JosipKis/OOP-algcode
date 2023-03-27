package zd4;

import java.util.Scanner;

public class Zadatak4_6 {

	public static void main(String[] args) {
		
		String dobra = "dobro";
		String bolja = "bolje";
		String najbolja = "najbolja";
		String sad = "lose";
		Scanner unos = new Scanner(System.in);
		System.out.println("Kako se osjecate danas?");
		String str = unos.nextLine();
		if (dobra.equals(str)) {
			System.out.println("Hvala, danas sam "+ dobra);
		}else if (bolja.equals(str)) {
			System.out.println("Hvala, danas sam "+ bolja);
		}else if (najbolja.equals(str)) {
			System.out.println("Hvala, danas sam "+ najbolja);
		}else if (sad.equals(str)) {
			System.out.println("Sigurno ce biti bolje :)");
		}
	}

}
