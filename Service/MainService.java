package Service;

import modle.Country;
import modle.Student;

public class MainService {

	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("AB987654", "John", "Sarfo", "ITF", 2007, Country.other, "LU123456");
				
				System.out.println(stud2);
				
				Student stud3 = new Student("GH547523", "Kolin", "Wood", "OPS", 2005, Country.other, "AU765432");
				
				System.out.println(stud3);
				
Student stud4 = new Student("JK784538", "Nickolas", "Fletcher", "OPS", 2004, Country.other, "BR456789");
				
				System.out.println(stud4);

	}

}
