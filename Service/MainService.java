package Service;

import modle.Country;
import modle.Student;

public class MainService {

	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				System.out.println(stud2);

	}

}
