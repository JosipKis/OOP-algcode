package zd2;
import java.util.Scanner;
public class Zd2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite radijus kugle: ");
		double r = unos.nextDouble();
		if (r < 0) {
			System.out.println("Broj koji ste unijeli je manji od nule!");
		}else {
			double volumen = (double) (4.0/3)*Math.PI*r*r*r;
			System.out.println("Volumen kugle s unesenim radiusom je: "+ volumen);
		}
		unos.close();
		

	}

}
