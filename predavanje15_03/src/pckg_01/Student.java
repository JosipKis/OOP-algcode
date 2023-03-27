package pckg_01;

public class Student extends Person{
	/*
	 *  klasa može isključivo extendati jednu klasu!
	 *  Java može imati veći broj sučelja od pythona
	 *  python može više od jedne
	 */ 

	public Student(String name, int age) {
		super(name, age); //super je rezervirana rijec koja zove konstruktora iz 'extended' klase
	}
	
	public void passTHEexam() {
		
		System.out.println("Exam in OOP was peace of cake:)");
		
	}
	
	
}
