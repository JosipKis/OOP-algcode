package predavanje_12_4_interfaces;

public class SpiderMan extends Person implements Fly, Run {
	
	private boolean net;

	protected SpiderMan(String name, String occ, int age) {
		super(name, occ, age);
		this.net = true;
	}

	@Override
	public void runningAbility() {
		System.out.println("Better than most ordinary humans...");
	}

	@Override
	public void flyAbility() {
		if (net) {
			System.out.println(getClass().getSimpleName() +" almost can fly...");
		}else {
			System.out.println("Probably injured his back...");
		}
	}

	@Override
	protected void provideExplanation() {
		System.out.println("This is my swim suit...");
	}

}
