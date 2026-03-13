package Service;

import java.util.ArrayList;
import java.util.Arrays;

import modle.Country;
import modle.Course;
import modle.Grade;
import modle.Professor;
import modle.ProfessorDegree;
import modle.Student;

public class MainService {
	
	private static ArrayList<Student> allStudents 
												= new ArrayList<Student>();
	
	private static ArrayList<Professor> allProfessors
												= new ArrayList<Professor>();
	
	private static ArrayList<Course> allCourses
											= new ArrayList<Course>();
	
	private static ArrayList<Grade> allGrades
											= new ArrayList<Grade>();
	
	
	
	

	public static void main(String[] args) {
		
		
		
				System.out.println("---------------Student-----------------");
		
Student stud1 = new Student();
				System.out.println(stud1);
		
Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				System.out.println(stud2);
				
Student stud3 = new Student("GH547523", "Kolin", "Wood", "OPS", 2005, Country.other, "AU765432");
				
				System.out.println(stud3);
				
Student stud4 = new Student("JK784538", "Nickolas", "Fletcher", "OPS", 2004, Country.other, "BR456789");
				
				System.out.println(stud4);				
				
				
				
				allStudents.add(stud1);
				allStudents.add(stud2);
				allStudents.add(stud3);
				
				System.out.println(allStudents);
				
				for (int i = 0; i<allStudents.size(); i++) {
					if(allStudents.get(i).getCountry().equals(Country.Latvia)) {
						
					}
				}
				

				System.out.println("----------------Professor----------------");
	
Professor proff1 = new Professor ();
				System.out.println(proff1);
		
Professor proff2 = new Professor ( "Elliot", "Kelner", ProfessorDegree.master);
				System.out.println(proff2);
				
Professor proff3 = new Professor ( "Adel", "Legran", ProfessorDegree.bachelor);
				System.out.println(proff3);
				
				
				allProfessors.add(proff1);
				allProfessors.add(proff2);
				allProfessors.add(proff3);
				
				System.out.println(allProfessors);
		
		

				System.out.println("---------------Course-----------------");
		
Course cour1 = new Course();
				System.out.println(cour1);
		
Course cour2 = new Course( 12346, "Data Structure", 6, proff2);
				System.out.println(cour2);
				
Course cour3 = new Course( 12378, "Managment", 8, proff3);
				System.out.println(cour3);


				allCourses.addAll(Arrays.asList(cour1, cour2, cour3));

				
				System.out.println(allCourses);
				
				
				

				System.out.println("---------------Grade-----------------");

Grade gr1 = new Grade();
				System.out.println(gr1);

Grade gr2 = new Grade(50, stud3, cour2);
				System.out.println(gr2);
				
				allGrades.add(gr1);
				allGrades.add(gr2);

				
				System.out.println(allGrades);
		
}
	

	

}
