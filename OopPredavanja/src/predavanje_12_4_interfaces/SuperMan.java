package predavanje_12_4_interfaces;

public class SuperMan extends Person implements Fly, Run, SuperVision{

	private boolean mood;
	
	protected SuperMan(String name, String occ, int age) {
		super(name, occ, age);
		this.mood = false;
	}

	@Override
	public void enableSuperVision() {
		if (!mood) {
			System.out.println("Supervision is on...");
		}else {
			System.out.println("Leave me alone...");
		}
	}

	@Override
	protected void provideExplanation() {
		System.out.println("Where are my glasses?");
	}

	@Override
	public void runningAbility() {
		System.out.println("Not as fast as Flash...");
	}

	@Override
	public void flyAbility() {
		System.out.println("Can fly faster than a plane...");
	}

}
