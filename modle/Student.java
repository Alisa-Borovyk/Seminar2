package modle;

//Model class - data class
public class Student extends Person{
//1. variables
	private String matriculNumber;
	private String faculty;
	private int birthYear;
	private Country country;
	
//2/ getters
	public String getMatriculaNumber() {
		return matriculNumber;
	}
	
	public String getFaculty() {
		return faculty;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public Country getCountry() {
		return country;
	}
	

	
	
//3.setters
	public void setMatriculaNumber(String inputMatriculaNumber) {
		if( (inputMatriculaNumber !=null) && (!inputMatriculaNumber.isEmpty())
				&& ((inputMatriculaNumber.matches("[A-Z]{2}[0-9]{6}")))) {
		
	matriculNumber = inputMatriculaNumber;
	}
	else {
	matriculNumber = "Uknown";
	}
}
	

public void setFculty(String inputFaculty) {
	if( ( inputFaculty != null ) && (!inputFaculty.isEmpty())
			&& (inputFaculty.matches("[A-Za-z ]{3,100}"))) {
		
	faculty = inputFaculty;
	}
	else {
	faculty = "Uknown";
		}
	}


public void setBirthtYear(int inputBirthtYear) {{
	
	if((inputBirthtYear>= 1950) && (inputBirthtYear<=2020)) {
		
	birthYear = inputBirthtYear; 
	}
	
	else {
		
	}
	birthYear = 2008;

		}
	}

public void setCountry(Country inputCountry) {
    if(inputCountry != null){
        country = inputCountry;
    }
    else {
    	country = Country.unknown;
    }
}



//4 no-arg constructor
public Student () {
	
	super(); //this will call no arg constructor
	
	setMatriculaNumber ("AS876453");
	//setName("Aref");
	//setSurname("Hosseini");
	//setPassportNumber("SP092345");
	
	setFculty("ITF");
	setBirthtYear(2006);
	setCountry(Country.Latvia);
	
}


//5. arg-constructer


public Student (String inputMatriclNumber, String inputName, String inputSurname, 
		String inputFaculty, int inputBirthYear, 
		Country inputCountry, String inputPassportNumber) {
	
	super(inputName, inputSurname, inputPassportNumber);
	setMatriculaNumber(inputMatriclNumber);
	
	//setName(inputName);
	//setSurname(inputSurname);
	//setPassportNumber(inputPassportNumber);
	
	setFculty(inputFaculty);
	setBirthtYear(inputBirthYear);
	setCountry(inputCountry);
	
}
//6. toString

public String toString() {
	String result = name + " " + surname 
			+ " (" + matriculNumber + " )" + faculty + ", " 
			+ birthYear + " [" + country + "]" + passportNumber;
	return result;
}

//7. other function

}