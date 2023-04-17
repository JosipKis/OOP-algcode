package predavanje_12_4_apstraktne_klase;

public abstract class Device {

	protected String manufacturer;
	protected int id;
	protected static int cntID = 1;
	protected int batterylevel;
	
	protected Device(String manufacturer) {
		this.manufacturer = manufacturer;
		this.id = cntID++;
		this.batterylevel = 0;
	}

	

	protected abstract void startDevice();
	protected abstract int chargeDevice(); 
	public void deviceInfo() {
		System.out.println("Manufacturer: "+ manufacturer);
		System.out.println("battery level: "+ batterylevel);
		System.out.println("Device ID: "+ id);
	}
	
}
