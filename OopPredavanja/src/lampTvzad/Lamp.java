package lampTvzad;

import predavanje_12_4_interfaces.Settings;

public class Lamp extends Device implements Settings {
	
	private int brightness;
	private boolean intelligentMode = true;

	@Override
	public void setBrightness() {
		if (brightness == 10) {
			System.out.println("Lamp is on...");
		}else {
			System.out.println("Lamp is off...");
		}
		
	}

	@Override
	public void activateIntelligentMode() {
		if (intelligentMode) {
			System.out.println("You clapped so the "+ getClass().getSimpleName() +" is on...");
		}else {
			System.out.println("The lamp is off... You forgor to clap :(");
		}
		
	}

	@Override
	protected void electricityIsOn() {
		System.out.println("Electricity is flowing trough the lamp....");
	}

}
