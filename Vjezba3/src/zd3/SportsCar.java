package zd3;

import java.util.concurrent.ThreadLocalRandom;

public class SportsCar {
	private String brand;
	private String type;
	private String date;

	
	public SportsCar(String marka, String tip, String datum) {
		brand = marka;
		type = tip;
		date = datum;
		
	}
public int SportsCarID() {
	int rndID = ThreadLocalRandom.current().nextInt(300, 350);
	return rndID;
}
public void startVehicle() {
	System.out.println("Sports car starting the engine!");
}
public void engineRev() {
	System.out.println("Sports car is reving the engine");
}
public void vehInfo() {
	System.out.println("[Brand= "+ brand +" model= "+ type +" date= "+ date +" SportsCar ID= "+ SportsCarID() +"]");
}
}
