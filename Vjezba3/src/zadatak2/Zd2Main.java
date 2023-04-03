package zadatak2;

public class Zd2Main {

	public static void main(String[] args) {

		Robot robi = new Robot("Robi");
		robi.speak();
		boolean flag = false;
		while (!flag) {
			flag = robi.fill2Darr();
		}
		robi.print2DArr();
	}

}
