package equals;

import java.util.Objects;

public class TestEQ {

	public static void main(String[] args) {
		
		String s1 = "Ovo je neki string";
		String s2 = "Ovo je neki string";
		Person p1 = new Person("Ivana");
		Person p2 = new Person("Ivana");
		
		testEquals(s1, s2);
		System.out.println("--------------------------");
		testEqualsT(p1, p2);
		testEquals(s1, s2);
		p2.setId(100);
		testEqualsT(p1, p2);
	}
	
	static void testEquals(String prvi, String drugi) {
		System.out.println("S1: "+ prvi +" | S2: "+ drugi);
		System.out.println("String are equalsby using operator: "+ (prvi == drugi));
		System.out.println("String are equalsby using method: "+ prvi.equals(drugi));
		
		
	}
	
	static <T> void  testEqualsT(T ep1, T ep2) {
		System.out.println("----------- Java Generics in action -----------");
		System.out.println(ep1);
		System.out.println(ep2);
		System.out.println("Person objects are equals == : "+ (ep1 == ep2));
		System.out.println("Person objects are equals - equals method: "+ ep1.equals(ep2));
	}
	
	// inner class objekt
	static class Person{
		String name;
		int id;
		static int cntID = 100;
		
		public Person(String name) {
			this.name = name;
			this.id = cntID++;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			String desc  = getClass().getSimpleName()+ "@" + Integer.toHexString(this.hashCode());
			return "Person [name=" + name + ", id=" + id + "hash: " + desc +"]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Person))
				return false;
			Person other = (Person) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
		
		
	}
	
	
	
}
