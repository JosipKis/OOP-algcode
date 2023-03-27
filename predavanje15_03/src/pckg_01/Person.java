package pckg_01;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		// konstruktor
	}
		
	protected void tenYearsFromNow() {
		int tenFromNow = age + 10;
		System.out.println("Ten from now: "+ tenFromNow);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
