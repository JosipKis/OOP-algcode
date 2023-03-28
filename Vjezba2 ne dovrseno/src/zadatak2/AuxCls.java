package zadatak2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AuxCls {
	
	private static final int MAXINT = 330;
	private static final int MININT = 0;
	
	public static int[][] gen2DInt(int numRws, int numCols){
		int[][] int2D = new int[numRws][numCols];
		for (int k=0; k < numRws; k++) {
			for (int i = 0; i < numCols; i++) {
				int rndVal = ThreadLocalRandom.current().nextInt(MININT, MAXINT);
				int2D[k][i] = rndVal;
			}
		}
		System.out.println("Finished generating 2D array!");
		return int2D;
	}
	
	public static void print2DArraySND(int[][] arr) {
		for (int[] rw: arr) {
			System.out.println(Arrays.toString(rw));
		}
	}
	 
	public static void print2DArray(int[][] arr) {
		int nRws = arr.length;
		for (int k = 0; k < nRws; k++) {
			int nCol = arr[0].length;
			for (int q = 0; q < nCol; q++) {
				System.out.print(arr[k][q] + " " );
			}
			System.out.println();
		}
	}
	
}
