package predavanje_12_4_apstraktne_klase;

public class Test {

	public static void main(String[] args) {
		
		MobilePhone mp = new MobilePhone("Sony", "CPU-123", 128);
		mp.startDevice();
		int batteryLevel = mp.chargeDevice();
		System.out.println("Battery level after charging: "+ batteryLevel);
		System.out.println(mp);
		mp.extendInternalMemory(256);
	}


}
