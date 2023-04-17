package lampTvzad;

import predavanje_12_4_interfaces.Settings;

public class TV extends Device implements Settings{

	private int brightness;
	private boolean intelligentMode = true;
	
	@Override
	public void setBrightness() {
		System.out.println("You can set the brightness level between 0 and 100");
	}

	@Override
	public void activateIntelligentMode() {
		if (intelligentMode) {
			System.out.println("You changed the "+ getClass().getSimpleName() +"'s chanell by claping...");
		}else {
			System.out.println("You sure like this channel...");
		}
		
	}

	@Override
	protected void electricityIsOn() {

		System.out.println("Electricity is flowing trough TV....");
	}

}
