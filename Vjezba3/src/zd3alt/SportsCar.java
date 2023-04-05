package zd3alt;

public class SportsCar extends Vehicle {
	
	private String color;
	
	public SportsCar(String model, String brand, String color) {
		super(model, brand);
		this.color = color;
	}
	
	public void setSpotsCarProductionDate(String dateProduction) {
		super.setProductionDate(dateProduction);
	}

	@Override
	public void starVehicle() {
		super.starVehicle();
		System.out.println("Starting the engine of a sport car...");
		
	}

	@Override
	public String toString() {
		String test = super.toString();
		return test +"SportsCar [color=" + color + "]";
	}

	
}
