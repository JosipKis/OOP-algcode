package zad1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
	
	private DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");;
	protected Date enrolmentDate;
	protected String name;
	protected int idStudent;
	protected int cntStudents = 100;
	private Scanner scanner = new Scanner(System.in);
	
	public Student(String name) {
		this.name = name;
		this.idStudent = cntStudents++;
	}
	protected void setEnrolmentDate() throws ParseException {
		System.out.println("Please enter students date of enrolment in form of dd-mm-yyyy -  ");
		String dateOfE = scanner.nextLine();
		this.enrolmentDate = DATE_FORMAT.parse(dateOfE);
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;	
	}
	
	protected void infoStudent() {
		System.out.println("Students name - "+ this.name +"\nid - "+ this.idStudent);
		System.out.println("Date of enrloment - "+ enrolmentDate.toString());
	}
	protected abstract void completedStudy(int years);
	
	public static class DS_Student extends Student{

		public DS_Student(String name) {
			super(name);
		}

		@Override
		protected void completedStudy(int years) {
			if (years < 2) {
				System.out.println("Student/ica "+ this.name +" nije upisao/la posljednu godinu studija!");
			}else if (years == 2) {
				System.out.println("Student/ica "+ this.name +" je na posljednoj godini studija!");
			}
		}
	}
	public static class PDS_Student extends Student{

		public PDS_Student(String name) {
			super(name);
			this.idStudent = cntStudents++;
			}

		@Override
		protected void completedStudy(int years) {
			if (years < 3) {
				System.out.println("Student/ica "+ this.name +" nije upisao/la posljednu godinu studija!");
			}else if (years == 3) {
				System.out.println("Student/ica "+ this.name +" je na posljednoj godini studija!");
			}
		}
		
	}
	
}
