package zadatak7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zd7 {
	static final int MIN = 1;
	static final int MAX = 101;
	
	public static void main(String[] args) {

		int[][] nizInt = new int[3][4];
		for (int i = 0; i < nizInt.length; i++) {
			for (int c = 0; c < nizInt[i].length; c++) {
				nizInt[i][c] = (int) (ThreadLocalRandom.current().nextInt(MIN, MAX));
			}
		}
		System.out.println(Arrays.deepToString(nizInt));
		maksimalnaVrijednost(nizInt);
	}
	
	public static int maksimalnaVrijednost(int[][] nekiIntNiz) {
		/*
		 * Metoda koja vraca maksimalnu vrijednost nekog int 2D arraya
		 */
		int maks = 0;
		for (int i = 0; i < nekiIntNiz.length; i++) {
			for (int c: nekiIntNiz[i]) {
				if (c > maks) {
					//System.out.println(c);
					maks = c;
				}
			}
		}
		System.out.println("Maksimalna vrijednost niza je: "+ maks);
		return maks;
	}
}
