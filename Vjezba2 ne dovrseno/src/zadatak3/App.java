package zadatak3;
//zd3

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Primjer 2D niza
 * @author ante
 * @version 1.1
 * @since 03/2018
 */

public class App {

	public static void main(String[] args) {
		// deklariranje i inicijalizacija 2D niza
		double[][] vars = new double[3][5];
		int nrows = vars.length;
		int nclmns = vars[0].length;
		double min = 500.45;
		double max = 12578.32;

		// popunjavanje vrijednosti 2D niza
		for (int i = 0; i < nrows; i++) {
			for (int j = 0; j < nclmns; j++) {

				// Generiranje slučajne vrijednosti između zadanih granica
				vars[i][j] = ThreadLocalRandom.current().nextDouble(min, max);
			}
		}

		// Bivša For each petlja, sada klasična for petlja (JK)
//		for(double[] rw : vars) {
//			System.out.println(Arrays.toString(rw));
//		}
		
		for (int c = 0; c < vars.length; c++) {
			for (int i = 0; i < vars[c].length; i++) {
				System.out.print(vars[c][i] + ", ");
			}
			System.out.println("");
		}
	}
	

}
