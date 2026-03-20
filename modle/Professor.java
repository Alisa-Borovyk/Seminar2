package modle;

public class Professor {

	//1. variables
	private long id;
	private String name;
	private String surname;
	private ProfessorDegree degree;
	private String passportNumber;
	
	
	
	//helper variable
	private static long counter = 0;


	//2. getters
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public String getSurname() {
			return surname;
	}
		
	public ProfessorDegree getProfessorDegree() {
				return degree;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
			
	
	//3.setters
	
	public void setId() {
	id= counter;
	counter++;
	}
	
	
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
	public void setProfessorDegree(ProfessorDegree inputProfessorDegree) {
	    if(inputProfessorDegree != null){
	        degree = inputProfessorDegree;
	    }
	    else {
	    	degree = ProfessorDegree.uknown;
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
	
	
	
	//4 no-arg constructor
	
	public Professor () {
		setId ();
		setName("Oliver");
		setSurname("Ridll");
		setProfessorDegree(ProfessorDegree.bachelor);
		setPassportNumber("AT12456");
	}
	
	//5. arg-constructer
	
	public Professor(String inputName, String inputSurname, ProfessorDegree inputDegree,String inputPassportNumber) {
		
		setId();
		setName(inputName);
		setSurname(inputSurname);
		setProfessorDegree(inputDegree);
		setPassportNumber(inputPassportNumber);
	}
	
	//6. toString
	
	public String toString() {
		String result = name + " " + surname 
				+ " (" + id + " )" + "(" + degree + ")" + passportNumber;
		
		return result;
	
	
	
	
	
	
	
	}
	
}
