package predavanje_12_4_apstraktne_klase;

public class MobilePhone extends Device {
	
	private int memory;
	private String cpu;

	protected MobilePhone(String manufacturer, String cpu, int mem) {
		super(manufacturer);
		this.cpu = cpu;
		this.memory = mem;
	}

	@Override
	protected void startDevice() {

		System.out.println(getClass().getSimpleName() +" power button on...");
	}

	@Override
	protected int chargeDevice() {
		if (batterylevel < 20) {
			System.out.println("Battery level is: "+ batterylevel);
			System.out.println("Charging to max...");
			batterylevel = 100;
		}else {
			System.out.println("Enough battery for the rest of the day...");
		}
		return batterylevel;
	}

	@Override
	public String toString() {
		return "MobilePhone [memory=" + memory + ", cpu=" + cpu + ", manufacturer=" + manufacturer + ", id=" + id
				+ ", batterylevel=" + batterylevel + "]";
	}

	public void extendInternalMemory(int cap) {
		System.out.println("Memory extended for -> "+ cap);
	}
}
