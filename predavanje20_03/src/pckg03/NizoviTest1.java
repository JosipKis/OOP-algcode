package pckg03;

import java.util.Arrays;

import pckg01.SuperUser;
import pckg01.User;

public class NizoviTest1 {

	public static void main(String[] args) {

		int[] niz1 = new int[10];
		float[] niz2 = new float[5];
		int[] niz3 = {2, 4, 0, -12, 54, -111, 69};
		User[] users = new SuperUser[3];
		printElements(niz1);
		printElements(niz2);
		System.out.println(users);
		System.out.println(Arrays.toString(users));
		users[1] = new User("Ustor", "Simple user");
		System.out.println(Arrays.toString(users));
		

	}
	
	private static void printElements(int[] ar) {
		for(int k = 0; k < ar.length; k++) {
			System.out.println("Element: "+ ar[k]);
		}
	}
	
	private static void printElements(float[] ar) {
		for(int k = 0; k < ar.length; k++) {
			System.out.println("Element: "+ ar[k]);
		}
	}
}
