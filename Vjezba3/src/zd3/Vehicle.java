package zd3;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
	
	private String brand;
	private String type;
	private String date;

	
	public Vehicle(String marka, String model) {
		brand = model;
		type = marka;
		
	}
public int vehID() {
	int rndID = ThreadLocalRandom.current().nextInt(300,350);
	return rndID;
}
public void setDate(String datum) {
	System.out.println(datum);
}
public void startVehicle() {
	System.out.println("Vehicle starting the engine!");
}
public void stopVehicle() {
	System.out.println("Vehicle stop the vehicle!");
	System.out.println("Vehicle turn off the engine!");
}
public void vehInfo() {
	System.out.println("[Brand= "+ brand +" model= "+ type +" date= "+ date +" vehID= "+ vehID() +"]");
}
}
