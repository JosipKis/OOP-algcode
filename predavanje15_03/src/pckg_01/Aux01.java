package pckg_01;

public class Aux01 {
	 
	// kad je 'final' uz klasu nitko ne može nasljediti klasu
	// 'final' klase se ne mogu extendati
	 
	static int idx;
	private String classSpecname;
	static final int PR = 21;
	
	public Aux01(String name) {
		//ovo je konstruktor, njegovo ime mora odgovarati imenu klase!
		classSpecname = name;
		idx = 101;
	}
	
	public static int sumFirstNInt(int n) {
		
		int sum = 0;
		for (int k=1; k<=n; k++) { 
			// k++ je isto što i k=k+1
			sum = sum + k;
			
		}
		System.out.println("Rezultat je: "+ sum);
		return sum;
	}
	
	static int sumFirstNIntWhile(int n) {
		
		int sum = 0;
		int k = 1;
		while (k <= n) {
			sum = sum + k;
			k++;
		}
		System.out.println("Rezultat u while petlji je: "+ sum);
		return sum;
			
		
	}

	@Override
	public String toString() {
		return "Aux01 [classSpecname=" + classSpecname + "] | "+ idx;
	}

	public String getClassSpecname() {
		return classSpecname;
	}

	public void setClassSpecname(String classSpecname) {
		this.classSpecname = classSpecname;
	}
	
	

}