package zd3alt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

	String model;
	String brand;
	SimpleDateFormat dateFormater;
	int carId;
	private static int cntID = 110;
	Date productiondate;
	
	public Vehicle(String model, String brand) {
		this.brand = brand;
		this.model = model;
		this.carId = cntID++;
		dateFormater = new SimpleDateFormat("dd/MM/yyyy.");
		
	}
	
	public void setProductionDate(String dateProduced) {
		try {
			productiondate = dateFormater.parse(dateProduced);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void starVehicle() {
		System.out.println(getClass().getSimpleName() +" starting engine...");
	}
	
	public void stpVehicle() {
		System.out.println(getClass().getSimpleName() +" stopping engine...");
	}

	
	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", carId=" + carId + ", productiondate="
				+ dateFormater.format(productiondate) + "]";
	}

	public void vehInfo() {
		System.out.println(this);
	}
}
