package zd4;
import java.util.Scanner;

/*
 *U primjeru 4-4 nedostatak petlje je taj da će obaviti samo jedno ponavljanje, a petlje
 *se inače koriste kada je potreban veći broj ponavljanja. 
 */

public class Zadatak4_4 {

	public static void main(String[] args) {
	
		Scanner unos = new Scanner(System.in);
		boolean trueValue = true;
		do {
			System.out.println("Unesite neki string: ");
			String str = unos.nextLine();
			System.out.println("Unijeli ste: "+ str);
			System.out.println("Ako zelite ponoviti unos unesite 'y', u suprotnome unesite bilo sto drugo: ");
			String daNe = unos.nextLine();
			if ("y".equals(daNe)) {
				
			}else {
				trueValue = false;
				System.out.println("Odabrali ste izlaz iz programa!");
			}
			
		}while(trueValue);
			
		
	}
}
