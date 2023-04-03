package zd3;

public class VehClient {
	
	static Vehicle v1;
	static SportsCar sc1;
	static SportsCar sc2;

	public static void main(String[] args) {
        v1 = new Vehicle("Mercedes", "M101");
        v1.setDate("20-02-2002");
        v1.startVehicle();
        v1.stopVehicle();
        v1.vehInfo();
        sc1 = new SportsCar("SuperCar-NN1", "CROBrand-1", "18-06-1999");
        System.out.println("----------------------------------------------");
        sc1.startVehicle();
        sc1.engineRev();
        sc1.vehInfo();
        sc2 = new SportsCar("SuperCar-NN2", "CROBrand-23", "18-06-2008");
        sc1.startVehicle();
        sc1.engineRev();
        sc2.vehInfo();
		
	}

}
