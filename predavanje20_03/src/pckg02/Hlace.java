package pckg02;

public class Hlace {


	private int width;
	private int height;
	private String material;
	private boolean isClear;
	
	public Hlace(String material, boolean isClear) {
		this.material = material;
		this.isClear = isClear;
		
	}

	public Hlace(int h, int w, String m, boolean isCl) {
		this(m,isCl);
		height = h;
		width = w;
		
	}
	
	public Hlace notClear(boolean isCl) {
		if (!isCl) {
			// ! je jednak kao i 'not' u pythonu
			this.isClear = isCl;
			
		}
		return this;
	}
	
	public void clearHlace() {
		if (this.isClear) {
			System.out.println("Hlace ne treba oprati - ciste su!");
			
		}else {
			System.out.println("Aktiviran proces pranja!");
			operiHlace(this);
			
		}
	}
	
	private void operiHlace(Hlace hlace) {
		System.out.println("Proces pranja hlaca....");
		this.isClear = true;
		System.out.println("Finished - Sve cisto!");
		
	}

	@Override
	public String toString() {
		return "Hlace [width=" + width + ", height=" + height + ", material=" + material +", hashcode=@=" + this.hashCode() + ", isClear=" + isClear + "]";
	}
	
	
}


