package pckg_01;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("Josip", 20);
		System.out.println(Integer.toHexString(person1.hashCode()));
		testPersonAsReference(person1, "Bobi");
		System.out.println("After the method call: ");
		System.out.println(person1);

	}
	
	private static void testPersonAsReference(Person person, String newName) {
		
		System.out.println(person);
		System.out.println("@"+ Integer.toHexString(person.hashCode()));
		System.out.println("Changing person name: ");
		person.setName(newName);
		System.out.println("After the change...");
		System.out.println(person);
		System.out.println("@"+ Integer.toHexString(person.hashCode()));
		
		
	}
	
}
