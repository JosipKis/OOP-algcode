package zadatak2;

public class Test02 {

	public static void main(String[] args) {

		int[][] arr2D = AuxCls.gen2DInt(4, 3);
		AuxCls.print2DArray(arr2D);
		System.out.println("Drugi nacin: ");
		AuxCls.print2DArraySND(arr2D);
	}

}
