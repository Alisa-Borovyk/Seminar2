package modle;

public class Professor extends Person {

	//1. variables
	private long id;
	private ProfessorDegree degree;
	
	
	//helper variable
	private static long counter = 0;


	//2. getters
	
	public long getId() {
		return id;
	}
		
	public ProfessorDegree getProfessorDegree() {
				return degree;
	}
	
			
	
	//3.setters
	
	public void setId() {
	id= counter;
	counter++;
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
		
		super ();
		setId ();
		setProfessorDegree(ProfessorDegree.bachelor);
	}
	
	//5. arg-constructer
	
	public Professor(String inputName, String inputSurname, ProfessorDegree inputDegree,String inputPassportNumber) {
		
		super(inputName, inputSurname, inputPassportNumber);
		setId();
		setProfessorDegree(inputDegree);
		
	}
	
	//6. toString
	
	public String toString() {
		String result = name + " " + surname 
				+ " (" + id + " )" + "(" + degree + ")" + passportNumber;
		
		return result;
	
	
	
	
	
	
	
	}
	
}
