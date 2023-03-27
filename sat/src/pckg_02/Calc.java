package pckg_02;

public class Calc {

	public static void division1(float a, float b) {
		
		float c = a/b;
		if (b != 0) {
			System.out.println(c);
		} else {
			System.out.println("Nema dijeljenja s nulom!");
		}
	}

	public float circle(float r) {
		
		float p = r*r*3.14f;
		if (r < 0.0f) {
			System.out.println("Rad treba biti pozitivan!");
			return p;
			
		}else {
			System.out.println("Povrsina je: "+ p);
			return p; 
		}

		
	}
}
	


