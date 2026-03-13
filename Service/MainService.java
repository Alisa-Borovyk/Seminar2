package Service;

import modle.Country;
import modle.Course;
import modle.Professor;
import modle.ProfessorDegree;
import modle.Student;

public class MainService {

	public static void main(String[] args) {
		
		
		
		System.out.println("--------------------------------");
		
		Student stud1 = new Student();
		System.out.println(stud1);
		
Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				System.out.println(stud2);
				
Student stud3 = new Student("GH547523", "Kolin", "Wood", "OPS", 2005, Country.other, "AU765432");
				
				System.out.println(stud3);
				
Student stud4 = new Student("JK784538", "Nickolas", "Fletcher", "OPS", 2004, Country.other, "BR456789");
				
				System.out.println(stud4);

				System.out.println("--------------------------------");
	
Professor proff1 = new Professor ();
		System.out.println(proff1);
		
Professor proff2 = new Professor ( "Elliot", "Kelner", ProfessorDegree.master);
		System.out.println(proff2);
		
		

		System.out.println("--------------------------------");
		
Course cour1 = new Course();
		System.out.println("cour1");
		
Course cour2 = new Course( 12346, "Data Structure", 6, proff2);
System.out.println("cour2");
		
		
		
}
	

	

}
