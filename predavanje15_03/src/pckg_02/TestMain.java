package pckg_02;

import pckg_01.Aux01;
import pckg_01.Person;
import pckg_01.Student;

public class TestMain {

	public static void main(String[] args) {
		//kad nema modifikatora pristupa (public, private) ograničeni smo na jedan paket

		Aux01 aa1 = new Aux01("NAME002");
		aa1.sumFirstNInt(10);
		Person prs1 = new Person("Josipa", 22);
		Student st2 = new Student("Robi", 21);
		
	}

}
