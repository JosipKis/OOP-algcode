package pckg02;

public class MainTest {

	public static void main(String[] args) {

		Hlace hlace = new Hlace(34, 34, "Jeans", true);
		System.out.println(hlace);
		Hlace hl2 = hlace.notClear(false);
		System.out.println(hl2);
		System.out.println(hlace);
		hlace.clearHlace();
		
	}

}
