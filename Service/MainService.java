package Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


import modle.Country;
import modle.Course;
import modle.Grade;
import modle.Person;
import modle.Professor;
import modle.ProfessorDegree;
import modle.Student;


public class MainService {
	
	private static ArrayList<Person> allPerson 
												= new ArrayList<Person>();

	
	private static ArrayList<Course> allCourses
											= new ArrayList<Course>();
	
	private static ArrayList<Grade> allGrades
											= new ArrayList<Grade>();
	
	
	
	

	public static void main(String[] args) throws Exception {
		
		
		
				System.out.println("---------------Student-----------------");
		
Student stud1 = new Student();
		
Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				
Student stud3 = new Student("GH547523", "Kolin", "Wood", "OPS", 2005, Country.other, "AU765432");
							
Student stud4 = new Student("JK784538", "Nickolas", "Fletcher", "OPS", 2004, Country.other, "BR456789");
						
				
				
				
	allPerson .add(stud1);
	allPerson .add(stud2);
	allPerson .add(stud3);
	
	
	System.out.println("---------------All Person-----------------");
	
	System.out.println(allPerson );
	
	
	System.out.println("---------------Student-----------------");
	for (Person temP : allPerson) {
		if (temP instanceof Student) {
			System.out.println(temP);
		}
	}
				System.out.println("----students from Latvia");
				
				for(int i = 0; i < allPerson.size(); i++) {
					if(allPerson.get(i) instanceof Student) {
						Student tempStudent = (Student) allPerson.get(i);
				
				
					if(tempStudent.getCountry().equals(Country.Latvia)) {
						System.out.println(tempStudent);
						
						
					}
					}
				}
				

				System.out.println("----------------Professor----------------");
	
Professor proff1 = new Professor ();
		
Professor proff2 = new Professor ( "Elliot", "Kelner", ProfessorDegree.master, "JA654321");
				
Professor proff3 = new Professor ( "Adel", "Legran", ProfessorDegree.bachelor, "DA675839");



				
				
		allPerson .add(proff1);
		allPerson .add(proff2);
		allPerson .add(proff3);

		for (Person temP : allPerson) {
			if (temP instanceof Professor) {
				System.out.println(temP);

			}
		}

				System.out.println("---------------Course-----------------");
		
Course cour1 = new Course();
		
Course cour2 = new Course( 12346, "Data Structure", 6, proff2);
				
Course cour3 = new Course( 12378, "Managment", 8, proff3);


				allCourses.addAll(Arrays.asList(cour1, cour2, cour3));

				
				System.out.println(allCourses);
				
				
				

				System.out.println("---------------Grade-----------------");

Grade gr1 = new Grade();

Grade gr2 = new Grade(2, stud3, cour2);
				
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
				
				System.out.println("--------Coursess for estere----------");

				ArrayList<Course> result3;
				try {
					result3 = filterCourseByProfessorID(1);
					System.out.println(result3);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

			}
				
				ArrayList<Grade> result4;
				try {
					result4 = FilterFailledGrades();
					System.out.println(result4);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				System.out.println("----------Crud for Professor-----------");
				
				try {
					System.out.println("---CREATE------");
					createNewProfessor("Karlis", "Immers", ProfessorDegree.master, "ER123456");
					for (Person temP : allPerson) {
						if (temP instanceof Professor) {
							System.out.println(temP);

						}
					}
					System.out.println("---RETRIEVE BY ID------");
					System.out.println(getProfessorById(2));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}

				System.out.println("---UPDATE BY ID------");
				UpdateProfessorById(2, "Mia", "Merly", ProfessorDegree.bachelor);
				for (Person temP : allPerson) {
					if (temP instanceof Professor) {
						System.out.println(temP);

					}
				}
				System.out.println("---DELETE BY ID------");
				DeleteProfessorById(1);
				for (Person temP : allPerson) {
					if (temP instanceof Professor) {
						System.out.println(temP);

					}
				}
			
				
				
	}

	public static void fillterAllProfessorsWithDegree(ProfessorDegree degree) {
		
		for(Person tempP : allPerson ) {
			if(tempP instanceof Professor)
			{
				
				Professor tempProfessor = (Professor)tempP;
				if(tempProfessor.getProfessorDegree().equals(degree))
				{
					System.out.println(tempProfessor);
}
}
				
			}
				
		}
	
	
	public static ArrayList<Student> FilterAllStudentWithBirthYearLargerThan (int inputBirthyearThreshold) throws Exception
	{
		
	
		
	
		ArrayList<Student> filteredStudents = new ArrayList<Student> ();
		for (Person tempS : allPerson ) {
			
		if (tempS instanceof Student) {
			Student tempStudent = (Student) tempS;
		
			
			if(tempStudent.getBirthYear() >= inputBirthyearThreshold) {
				filteredStudents.add(tempStudent);
				//System.out.println(tempS);
			}
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
			
			
			for(Person tempP : allPerson ) {
				if (tempP instanceof Student) {
					Student tempStudent = (Student) tempP;
				
				if(tempStudent.getFaculty().equals(inputFaculty)) {
					System.out.println(tempStudent);
					isThereResult = true;
				}
			}
			
			if(!isThereResult) {//is it false
				throw new Exception("T no stud wich faculty is "+" inputFaculty"); 
			}}
			}
			
			
			
			public static ArrayList<Course> filterCourseByProfessorID(long inputId) throws Exception{
				
				ArrayList<Course> filteredCourse = new ArrayList<Course>();
				
				for(Course tempC : allCourses) {
					if(tempC.getProfessor().getId()==inputId) {
							filteredCourse.add(tempC);
					}
			}
				if(filteredCourse.isEmpty()) {
					Exception myExc = new Exception
							("There is no course which "+" leading professor is with id" + inputId);
					throw myExc;
					}
				
				else {
				return filteredCourse;
				}
			
		}
				
				
				public  static ArrayList<Grade> FilterFailledGrades() throws Exception {
					ArrayList<Grade> filterGrades = new ArrayList<Grade>();
					for(Grade tempG : allGrades) {
						if(tempG.getValue() < 4) {
							filterGrades.add(tempG);
							
						}
					}
					if(filterGrades.isEmpty()) {
						Exception myExc = new Exception
								("There is no Failed Grades");
						throw myExc;
						}
					
					else {
					return filterGrades;
				}
				
				
		}
				
				//c
				
				public static void createNewProfessor (String inputName, String inputSurname, ProfessorDegree inputDegree,String inputPassportNumber)throws Exception {
					for(Person tempP : allPerson ) {
						
						//TODO If we want we can check
						
						
						
						if(tempP.getPassportNumber().equals(inputPassportNumber)) {
							Exception myEx =
									new Exception ("Professor already exists it the system");
							throw myEx;
						}
					}
					
					Professor newProfessors = new Professor (inputName, inputSurname, inputDegree, inputPassportNumber);
					allPerson .add(newProfessors);
				}
				
				
				//r
				
				/*for(Person tempP : allPerson ) {
				if (tempP instanceof Student) {
					Student tempStudent = (Student) tempP;
				
				if(tempStudent.getFaculty().equals(inputFaculty)) {
					System.out.println(tempStudent);
					isThereResult = true;
					*/

				
				public static Professor getProfessorById(long inputId)  throws Exception{
					
					if(inputId < 0) {
						Exception myEx = new Exception ("It should be 0 or positive");
						throw myEx;
					}
					
					for(Person tempP : allPerson ) {
						if(tempP instanceof Professor)
						{
							Professor tempProfessor = (Professor)tempP;
						
						if(tempProfessor.getId() == inputId) {
							
							return tempProfessor;
						}
					}
					}
					Exception myEx = new Exception("No such prof with Id" + inputId);
					throw myEx;
				}
				
				
				//u
				
				public static void UpdateProfessorById(long inpuId, String inputName, 
						String inputSurname, ProfessorDegree inputDegree) throws Exception {
					
					Professor profForUpdate = getProfessorById(inpuId);
					
					profForUpdate.setName(inputName);
					profForUpdate.setSurname(inputSurname);
					profForUpdate.setProfessorDegree(inputDegree);
					
				}
				
				//d
				public static void DeleteProfessorById(long inpuId) throws Exception {
					Professor profForDeleting = getProfessorById(inpuId);
					allPerson .remove(profForDeleting);
				}
				
				
				
				
}
