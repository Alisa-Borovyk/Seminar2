package modle;

public class Course {
	//1. variables
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;

	
	//2/ getters
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	//3.setters
	
	public void setId() {
		id= counter;
		counter++;
		}
	
	public void setTitle(String inputTitle ) {
		if( ( inputTitle != null ) && (!inputTitle.isEmpty())
				&& (inputTitle.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			
		title = inputTitle;
		}
		else {
		title = "Uknown";}
		
		}
		
		public void setCreditPoints(int inputCreditPoints) {
			
			if((inputCreditPoints >= 1) && (inputCreditPoints <= 10)) {
				
				creditPoints = inputCreditPoints; 
			}
			
			else {
				
			}
			creditPoints = 1;
		}

		
		public void setProfessor(Professor inputProfessor) {
		    if(inputProfessor != null){
		    	professor = inputProfessor;
		    }
		    else {
		    	professor = new Professor();
		    }
		}
		

		//4 no-arg constructor
		public Course() {
			
			setId();
			setTitle("JAVA");
			setCreditPoints(3);
			setProfessor(new Professor());
			
		}
		

		//5. arg-constructer
	public Course (long inputId, String inputTitle, int inputCreditPoints, Professor inputProfessor) {
		setId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
		
	//6. toString

	public String toString() {
	String result = id + " " + title + " " + creditPoints + " " + professor;
			
	return result;
		}

		

}
	
