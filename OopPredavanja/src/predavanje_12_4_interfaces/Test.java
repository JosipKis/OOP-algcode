package predavanje_12_4_interfaces;

public class Test {

	public static void main(String[] args) {

		SpiderMan sp = new SpiderMan("Peter", "Photographer", 16);
		SuperMan sm = new SuperMan("Clark", "Reporter", 33);
		sp.flyAbility();
		sm.flyAbility();
		sp.runningAbility();
		sm.runningAbility();
		sm.enableSuperVision();
	}

}
