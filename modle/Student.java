package modle;

//Model class - data class
public class Student {
//1. variables
	private String matriculNumber;
	private String name;
	private String surname;
	private String faculty;
	private int birthYear;
	private Country country;
	private String passportNumber;
	
//2/ getters
	public String getMatriculaNumber() {
		return matriculNumber;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
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
	public String getPassportNumber() {
		return passportNumber;
	}

	
	
//3.setters
	public void setMatriculaNumber(String inputMatriculaNumber) {
		if( (inputMatriculaNumber !=null) && (!inputMatriculaNumber.isEmpty())
				&& ((inputMatriculaNumber.matches("[A-Z]{1}[a-z]{2,15}([]{1}[A-Z]{1}[a-z]{2,15}))?")))) {
		
	matriculNumber = inputMatriculaNumber;
	}
	else {
	matriculNumber = "Uknown";
	}
	}
	
public void setName(String inputName ) {
	if( ( inputName != null ) && (!inputName.isEmpty())
			&& (inputName.matches("[A-Z]{1}[a-z]{2,15}([]{1}[A-Z]{1}[a-z]{2,15}))?"))) {
		
	name = inputName;
	}
	else {
	name = "Uknown";
	}
	
}

public void setSurname(String inputSurname ) {
	if( ( inputSurname != null ) && (!inputSurname.isEmpty())
			&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([]{1}[A-Z]{1}[a-z]{2,15}))?"))) {
		
	surname = inputSurname;
	}
	else {
	surname = "Uknown";
} 
}
public void setFculty(String inputFaculty) {
	if( ( inputFaculty != null ) && (!inputFaculty.isEmpty())
			&& (inputFaculty.matches("[A-Z]{1}[a-z]{2,15}([]{1}[A-Z]{1}[a-z]{2,15}))?"))) {
		
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

public void setPassportNumber(String inputPassportNumber) {
	if( ( inputPassportNumber != null ) && (!inputPassportNumber.isEmpty())
			&& (inputPassportNumber.matches("[A-Z]{1}[a-z]{2,15}([]{1}[A-Z]{1}[a-z]{2,15}))?"))) {
		
		passportNumber = inputPassportNumber;
	}
	else {
		passportNumber = "Uknown";
		}
	}

//4 no-arg constructor
public Student () {
	setMatriculaNumber ("1dq341");
	setName("Aref");
	setSurname("Hosseini");
	setFculty("ITF");
	setBirthtYear(2006);
	setCountry(Country.Latvia);
	setPassportNumber("SP092345");
	
}


//5. arg-constructer
public Student (String inputMatriclNumber, String inputName, String inputSurname, 
		String inputFaculty, int inputBirthYear, 
		Country inputCountry, String inputPassportNumber) {
	setMatriculaNumber(inputMatriclNumber);
	setName(inputName);
	setSurname(inputSurname);
	setFculty(inputFaculty);
	setBirthtYear(inputBirthYear);
	setCountry(inputCountry);
	setPassportNumber(inputPassportNumber);
}
//6. toString

public String toString() {
	String result = name + "" + surname 
			+ " (" + matriculNumber + " )" + faculty + ", " 
			+ birthYear + " [" + country + "]" + passportNumber;
	return result;
}

//7. other function

}