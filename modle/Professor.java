package modle;

public class Professor {

	//1. variables
	private long id;
	private String name;
	private String surname;
	private ProfessorDegree degree;
	
	
	
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
	
	
	
	//4 no-arg constructor
	
	public Professor () {
		setId ();
		setName("");
		setSurname("");
		setProfessorDegree(degree.uknown);
	}
	
	//5. arg-constructer
	
	public Professor(String inputName, String inputSurname, ProfessorDegree inputDegree) {
		
		setId();
		setName(inputName);
		setSurname(inputSurname);
		setProfessorDegree(inputDegree);
		
	}
	
	//6. toString
	
	public String toString() {
		String result = name + " " + surname 
				+ " (" + id + " )" + degree;
		
		return result;
	
	
	
	
	
	
	
	}
	
}
