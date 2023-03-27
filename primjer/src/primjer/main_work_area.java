package primjer;

import java.util.Scanner;

public class main_work_area {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kako se zoveš? ");
		String ime = input.nextLine();
		System.out.println("Koliko vam je godina?");
		int godine = input.nextInt();
		System.out.println("Koja vam je omiljena hrana?");
		input.nextLine();
		String hrana = input.nextLine();
		
		
		System.out.println("Dobar dan "+ ime +"!");
		System.out.println("Vi imate "+ godine + " godina.");
		System.out.println("Omiljena hrana vam je "+ hrana +"!");
	}

}
