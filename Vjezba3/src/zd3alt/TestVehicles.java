package zd3alt;

public class TestVehicles {

	public static void main(String[] args) {

		Vehicle audi = new Vehicle("Q7", "Audi");
		audi.setProductionDate("10/10/2019.");
		audi.vehInfo();
		audi.starVehicle();
		audi.stpVehicle();
		SportsCar sc = new SportsCar("DF 45","Mustang" , "Black");
		sc.starVehicle();
		sc.setSpotsCarProductionDate("14/02/2017.");
		System.out.println(sc);
		SedanCar sec = new SedanCar("23EE", "WWWWW", "green");
		sec.setDateProductionSedan("08/08/2020.");
		sec.vehInfo();
	}

}
