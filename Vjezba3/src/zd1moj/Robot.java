package zd1moj;

public class Robot {

	// Josip Kiš, 03/04/'23
	
	private int id;
	private String name;
	
	public Robot(String ime, int idx) {
		this.name = ime;
		this.id = idx;
	}
	public void walk() {
		System.out.println("I roboti znaju hodati~");
	}
	
	public static int factJel(int n, int granica) {
		int faktorijel = 1;
		if (n == 0) {
			for (int c = 1; c <= granica; c++) {
				faktorijel *= c;
				n += c;
			}
		}else {
			for (int c = 1; c <= granica; c++) {
				faktorijel *= n;
				n += c;
			}
		}
		return faktorijel;
		
	}
}
