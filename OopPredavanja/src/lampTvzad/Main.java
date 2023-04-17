package lampTvzad;

public class Main {

	public static void main(String[] args) {

		Lamp lampa = new Lamp();
		TV tv = new TV();
		lampa.electricityIsOn();
		tv.electricityIsOn();
		lampa.setBrightness();
		tv.setBrightness();
		lampa.activateIntelligentMode();
		tv.activateIntelligentMode();
		
		
	}

}
