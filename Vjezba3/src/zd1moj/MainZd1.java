package zd1moj;

public class MainZd1 {

	// Josip Kiš, 03/04/'23
	
	public static void main(String[] args) {
		
		Robot robot1 = new Robot("Roomba", 69);
		robot1.walk();
		int res = Robot.factJel(0, 3);
		System.out.println("Rezultat faktorijela je: "+ res);
	}

}
