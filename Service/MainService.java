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
		
Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				
Student stud3 = new Student("GH547523", "Kolin", "Wood", "OPS", 2005, Country.other, "AU765432");
							
Student stud4 = new Student("JK784538", "Nickolas", "Fletcher", "OPS", 2004, Country.other, "BR456789");
						
				
				
				
				allStudents.add(stud1);
				allStudents.add(stud2);
				allStudents.add(stud3);
				
				
				System.out.println(allStudents);
				System.out.println("----students from Latvia");
				for (int i = 0; i<allStudents.size(); i++) {
					if(allStudents.get(i).getCountry().equals(Country.Latvia)) {
						System.out.println(allStudents.get(i));
					}
				}
				

				System.out.println("----------------Professor----------------");
	
Professor proff1 = new Professor ();
		
Professor proff2 = new Professor ( "Elliot", "Kelner", ProfessorDegree.master);
				
Professor proff3 = new Professor ( "Adel", "Legran", ProfessorDegree.bachelor);
				
				
				allProfessors.add(proff1);
				allProfessors.add(proff2);
				allProfessors.add(proff3);
				
				System.out.println(allProfessors);
		
		

				System.out.println("---------------Course-----------------");
		
Course cour1 = new Course();
		
Course cour2 = new Course( 12346, "Data Structure", 6, proff2);
				
Course cour3 = new Course( 12378, "Managment", 8, proff3);


				allCourses.addAll(Arrays.asList(cour1, cour2, cour3));

				
				System.out.println(allCourses);
				
				
				

				System.out.println("---------------Grade-----------------");

Grade gr1 = new Grade();

Grade gr2 = new Grade(50, stud3, cour2);
				
				allGrades.add(gr1);
				allGrades.add(gr2);

				
				System.out.println(allGrades);
				
				System.out.println("------Professor with master degree------");
fillterAllProfessorsWithDegree(ProfessorDegree.master);
				System.out.println("------Professor with PHD degree------");
fillterAllProfessorsWithDegree(ProfessorDegree.phd);

				System.out.println("--------Student older than 2007----------");
	
				try {
					ArrayList<Student> result = FilterAllStudentWithBirthYearLargerThan(2007);
					System.out.println(result);
					
					System.out.println("--------Student Faculty----------");
					
					
					fillterAllStudentsWithFacultyITF("ITF");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

				
	}

	public static void fillterAllProfessorsWithDegree(ProfessorDegree degree) {
		
		for(Professor tempS : allProfessors) {
			if(tempS.getProfessorDegree().equals(degree)) {
				System.out.println(tempS);
				
			}
		}
	}
	
	public static ArrayList<Student> FilterAllStudentWithBirthYearLargerThan (int inputBirthyearThreshold) throws Exception
	{
		ArrayList<Student> filteredStudents = new ArrayList<Student> ();
		for (Student tempS : allStudents) {
			if(tempS.getBirthYear() >= inputBirthyearThreshold) {
				filteredStudents.add(tempS);
				//System.out.println(tempS);
			}
		}
		if(filteredStudents.isEmpty()) {
			Exception myExc = new Exception
					("There is no student wich birth yeasr is larger than "+" inputBirthyearThreshold");
			throw myExc;
			}
		
		else {
			return filteredStudents;
		}
		
		}
		
		
		
		public static void fillterAllStudentsWithFacultyITF(String inputFaculty) throws Exception {
			
			boolean isThereResult = false;
			
			
			for(Student tempS : allStudents) {
				if(tempS.getFaculty().equals(inputFaculty)) {
					System.out.println(tempS);
					isThereResult = true;
				}
			}
			
			if(!isThereResult) {//is it false
				throw new Exception("T no stud wich faculty is "+" inputFaculty");
			}
			
			
		}/*
			public static void r(String course) {
				
				for(Course tempS : allCourses) {
					if(tempS.getCourse().equals(course)) {
						System.out.println(tempS);
					}
					
				}
				
				public static void fillterAllGrades(String value) {
					
					for(String tempS : allGrades) {
						if(tempS.getValue().equals(value)) {
							System.out.println(tempS);
							
						}
						
					}
				*/
			
	
	
	
	

	
	
	
	
	

}
