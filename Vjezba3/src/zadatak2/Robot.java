package zadatak2;

import java.util.UUID;

public class Robot {
	
	private String name;
	private int id;
	private static int cntId = 10;
	private int[][] arr2D;
	private static final int RWMX = 5;
	private static final int CLMX = 4;
	private int counterFillArr;
	private boolean flag;
	
	public Robot(String name) {
		this.name = name;
		this.id = id;
		arr2D = new int[RWMX][CLMX];
		counterFillArr = 0;
		flag = false;
	}
	
	public void speak() {
		System.out.println("Hello human - My name is: "+ this.name);
		String uuid = UUID.randomUUID().toString();
		System.out.println("This is my massage to you: ");
		System.out.println(uuid);
	}
	
	public boolean fill2Darr(){
		if (counterFillArr < RWMX*CLMX) {
			int rw = counterFillArr / CLMX;
			int col = counterFillArr % CLMX;
			arr2D[rw][col] = counterFillArr;
			counterFillArr++;
		}else {
			System.out.println("An array is full!!!");
			flag = true;
		}
		return flag;
	}
	
	public void print2DArr() {
		for(int k = 0; k < RWMX; k++) {
			for (int c = 0; c < CLMX; c++) {
				System.out.print(arr2D[k][c]+ " ");
			}
			System.out.println();
		}
	}
	
	public void print2Darr2nd() {
		for (int[] rw: arr2D) {
			for (int el: rw) {
				System.out.print(el +" ");
			}
			System.out.println();
		}
	}
}
