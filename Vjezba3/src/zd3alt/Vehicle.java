package zd3alt;

public class Vehicle {

	private String model;
	
	private String brand;
	
	private SimpleDateFormat dateProduced;
	
	private int carId;
	
	public Vehicle(String model, String brand) {
		this.brand = brand;
		this.model = model;
		this.carId = carId;
		
	}
	
	public void setProductionDate(String dateProduced) {
		
	}
	
	public void starVehicle() {
		System.out.println(getClass().getSimpleName() +" starting engine...");
	}
	
	public void stpVehicle() {
		System.out.println(getClass().getSimpleName() +" stopping engine...");
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", carId=" + carId + "]";
	}
	
	public void vehInfo() {
		System.out.println(this);
	}
}
