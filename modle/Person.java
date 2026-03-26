package modle;

public class Person {
	//variables
	private String name;
	private String surname;
	private String passportNumber;



//getters

public String getName() {
	return name;
}

public String getSurname() {
	return surname;
}

public String getPassportNumber() {
	return passportNumber;
}


//setters

public void setName(String inputName ) {
	if( ( inputName != null ) && (!inputName.isEmpty())
			&& (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
		
	name = inputName;
	}
	else {
	name = "Uknown";
	}
	
}

public void setSurname(String inputSurname ) {
	if( ( inputSurname != null ) && (!inputSurname.isEmpty())
			&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
		
	surname = inputSurname;
	}
	else {
	surname = "Uknown";
} 
}

public void setPassportNumber(String inputPassportNumber) {
	if( ( inputPassportNumber != null ) && (!inputPassportNumber.isEmpty())
			&& (inputPassportNumber.matches("[A-Z]{2}[0-9]{6}"))) {
		
		passportNumber = inputPassportNumber;
	}
	else { 
		passportNumber = "Uknown";
		}
	}

//both construcors

public Person () {
	setName("Aref");
	setSurname("Hosseini");
	setPassportNumber("SP092345");
	
	}

public Person  (String inputName, String inputSurname, 
		String inputPassportNumber) {
			
	setName(inputName);
	setSurname(inputSurname);
	setPassportNumber(inputPassportNumber);
	}


	
//ToString

public String toString() {
	String result = name  +"["  + surname + "] [" + passportNumber + "]";
	return result;


}
}











