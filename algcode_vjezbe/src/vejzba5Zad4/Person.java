package vejzba5Zad4;

public class Person {

	public static int cnt = 1;
	private int id;
	private String name;

	public Person(String name) {
		this.name = name;
		this.id = cnt;
		cnt++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}