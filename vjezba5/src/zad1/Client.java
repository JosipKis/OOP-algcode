package zad1;

import java.text.ParseException;
import java.util.Scanner;

import zad1.Student.DS_Student;
import zad1.Student.PDS_Student;

public class Client {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		DS_Student student1 = new DS_Student("Josip");
		PDS_Student student2 = new PDS_Student("Josipa");
		student1.setScanner(scanner);
		student1.setEnrolmentDate();
		student1.completedStudy(2);
		student1.infoStudent();
		System.out.println("-----------------------------------------");
		student1.setScanner(scanner);
		student2.setEnrolmentDate();
		student2.completedStudy(2);
		student2.infoStudent();
		
	}
}
