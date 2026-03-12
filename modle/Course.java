package modle;

public class Course {
	
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;

	
	///////////////////////////////////////////
	
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
	
	
	////////////////////////////////////////////////
	
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
			
			if((inputCreditPoints >= 3) && (inputCreditPoints <= 6)) {
				
				creditPoints = inputCreditPoints; 
			}
			
			else {
				
			}
			creditPoints = 3;
		}

		
		public void setProfessor(Professor inputProfessor) {
		    if(inputProfessor != null){
		    	professor = inputProfessor;
		    }
		    else {
		    	professor = new Professor();
		    }
		}
		
		
		///////////////////////////////////////
		
		
		public Course() {
			
			setId();
			setTitle("");
			setCreditPoints(3);
			setProfessor(professor);
			
		}
		
		//////////////////////////////////
	
	public Course (long inputId, String inputTitle, int inputCreditPoints, Professor inputProfessor) {
		setId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
		
		///////////////////////////////////
		/// 
		/// public String toString() {
	String result = id + title + creditPoints + professor;
			;
	return result;
}

		

		}
	
