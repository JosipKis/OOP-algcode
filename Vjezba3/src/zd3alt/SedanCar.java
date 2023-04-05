package zd3alt;

public class SedanCar extends Vehicle {
	
	String color;
	
	public SedanCar(String model, String brand, String color) {
		super(model, brand);
		this.color = color;
		
	}

	public void setDateProductionSedan(String date) {
		this.setProductionDate(date);
	}

	@Override
	public String toString() {
		return "SedanCar [color=" + color + ", model=" + model + ", brand=" + brand + ", carId=" + carId
				+ ", productiondate=" + dateFormater.format(productiondate) + "]";
	}

	@Override
	public void vehInfo() {
		System.out.println(this);
	}
	
	
}
