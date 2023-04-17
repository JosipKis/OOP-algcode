package predavanje_12_4_interfaces;

public abstract class Person {

	protected String name;
	protected String occupation;
	protected int age;
	
	protected Person(String name, String occ, int age) {
		this.age = age;
		this.occupation = occ;
		this.name = name;
	}
	
	protected abstract void provideExplanation();
	
	protected void takeTaxi() {
		System.out.println(getClass().getSimpleName()+" can take a taxi for a ride...");
	}
}
