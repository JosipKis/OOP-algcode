package pckg_01;

public class Sat_prvi {

	public static void main(String[] args) {

		byte n1 = 125;
		byte n2 = 1;
		int a = 10;
		int b = 25;
		
		n1 += 3;
		System.out.println(n1);
		System.out.println("Maximal value of int is: " + Integer.MAX_VALUE);
		System.out.println("Maximal value of long is: " + Long.MAX_VALUE);
		System.out.println("=================================");
		
		printArgs(args);
		
		System.out.println("Value 'a' before method call is: "+ a +" | hex value fo 'a' is: "+ System.identityHashCode(a));
		System.out.println("Value 'b' before method call is: "+ b +" | hex value fo 'b' is: "+ System.identityHashCode(b));
		performSum(a, b);
		System.out.println("Value 'a' after method call is: "+ a +" | hex value fo 'a' is: "+ System.identityHashCode(a));
		System.out.println("Value 'b' after method call is: "+ b +" | hex value fo 'b' is: "+ System.identityHashCode(b));
		
	}
	
	private static void printArgs(String[] arguments) {
		
		// static može raditi samo sa static 'public/private static void'
		for(String str : arguments) {
			System.out.println(str);
			
		}
	}
	
	private static void performSum(int a, int b) {
		
		System.out.println("Value 'a' before sumaration is: "+ a +" | hex value fo 'a' is: "+ System.identityHashCode(a));
		System.out.println("Value 'b' before sumaration is: "+ b +" | hex value fo 'b' is: "+ System.identityHashCode(b));
		int sum = a + b;
		a += 1000;
		System.out.println("Sum is: "+ sum);
		System.out.println("Value 'a' after sumaration is: "+ a +" | hex value fo 'a' is: "+ System.identityHashCode(a));
		System.out.println("Value 'b' after sumaration is: "+ b +" | hex value fo 'b' is: "+ System.identityHashCode(b));
	}
	
	
}

/*
 * apstrakicja
 * indetitet
 * učahurivanje
 * nasljeđivanje
 * polimorfizam
*/

