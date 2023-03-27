package pckg_01;

import java.util.Scanner;

public class MainApp {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// 'new' aktivira konstruktor
		int sumN = Aux01.sumFirstNInt(5);
		// pozivamo klasu bez new kada klasina metoda ima 'static'
		int whileSum = Aux01.sumFirstNIntWhile(5);
		Aux01 a1 = new Aux01("Name-01"); //prvi objekt
		Aux01 a2 = new Aux01("Name-02"); //drugi objekt
		//Kreirali smo dva objekta!
		System.out.println(a1);
		System.out.println(a2); 
		// zajednički im je statički atribut, jer su vezani za klasu ne za objekt
		a1.setClassSpecname("ABC");
		System.out.println(a1); 
		Person pr1 = new Person("Petar", 30);
		Student st1 = new Student("Petrica", 23);
		pr1.tenYearsFromNow();
		st1.tenYearsFromNow();
		st1.passTHEexam();
		showArgs(args);
		ilustrateSwitch("prvi");
		scanner = new Scanner(System.in);
		userDefinedInput();
	}
	
	private static void showArgs(String[] arguments) {
		
		for(String strg: arguments) {
			System.out.println(strg);
		}
		System.out.println("Equivalent for loop:");
		for (int k=0; k < arguments.length; k++) {
			System.out.println(arguments[k]);
			
		}
	}
	
	private static void ilustrateSwitch(String caseString) {
		
		System.out.println("Go into switch direct..");
		switch (caseString) {
		case "prvi": 
			System.out.println("Prvi izbor je odabran!"); break;
		case "drugi":
			System.out.println("Drugi izbor je odabran!"); break;
		case "zadnji":
			System.out.println("Zadnji je odabran!"); break;
			
		default:
			System.out.println("unexpected value: " + caseString);
		}
	}
	
	private static void userDefinedInput() {
		
		System.out.println("Please enter ur name: ");
		String name = scanner.nextLine();
		System.out.println("Ur name is: "+ name);
	}
}
