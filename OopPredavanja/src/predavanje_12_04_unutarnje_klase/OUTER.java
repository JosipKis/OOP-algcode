package predavanje_12_04_unutarnje_klase;

import java.util.ArrayList;

public class OUTER {

	private String desc;
	private static final String OUTER = "Outer class";
	private static ArrayList<Integer> lst;
	
	public OUTER(String desc) {
		this.desc = desc;
		lst = new ArrayList<>();
	}
	
	static class InnerOnArrays {
		
		static void addElementToArray(Integer element) {
			lst.add(element);
			System.out.println("Added element to list is -> "+ element);
			System.out.println(lst);
		}
	}
	
	class INNER {
		
		public INNER() {
			System.out.println("Creating the inner class instance...");
		}
		
		public void innerInfo() {
			System.out.println(getClass().getSimpleName());
			System.out.println("Outter class -> "+ OUTER);
			System.out.println("@"+ Integer.toHexString(this.hashCode()));
		}
	}
	
	public void outerInfo() {
		System.out.println("Desc: "+ desc);
		System.out.println(getClass().getSimpleName());
		
	}
	// konstruktor za objekt inner klase, koji se nalazi unutar outer klase
	public INNER createInnerObj() {
		return new INNER();
	}
}
