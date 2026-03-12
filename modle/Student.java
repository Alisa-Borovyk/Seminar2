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

public Student(){
    setName("Unknown");
    setSurname("Unknown");
    setFculty("Unknown");
    setBirthtYear(2000);
    setCountry(Country.unknown);
    setPassportNumber("Unknown");
}



//5. arg-constructer
//6. toString
//7. other function

}