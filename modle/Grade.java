package modle;

public class Grade {
	//1. variables
	
	private long g_ID;
	private int value;
	private Student student;
	private Course course;

	//helper variable
	private static long counter = 0;


	
	//2 getters
	
	public long getG_ID() {
		return g_ID;
	}
	
	public int getValue() {
		return value;
	
	}
	 
	public Student getStudent () {
		return student;
		
	}
	
	public Course getCourde () {
		return course;
	}
	
	//3.setters
	
	public void setG_ID() {
		g_ID= counter;
		counter++;
		}

	
	public void setValue(int inputValue) {{
		
		if((inputValue>= 1) && (inputValue<=100)) {
			
		value = inputValue; 
		}
		
		else {
			
		}
		value = 100;

			}
				}
	
	public void setStudent(Student inputStudent) {
	    if(inputStudent != null){
	    	student = inputStudent;
	    }
	    else {
	    	student = new Student();
	    }
	
	}

	public void setCourse(Course inputCourse) {
	    if(inputCourse != null){
	    	course = inputCourse;
	    }
	    else {
	    	course = new Course();
	}
	    
	}
	
	//4 no-arg constructor
	
	public Grade () {
		setCourse(new Course ());
		setG_ID();
		setStudent(new Student ());
		setValue(100);
	}
	

	//5. arg-constructer
	
	public Grade ( int inputValue, Student inpStudent, Course inputCourse) {
        setG_ID();
		setValue(inputValue);
		setStudent(inpStudent);
		setCourse(inputCourse);
	}
	
	//6. toString
	
	public String toString() {
		String result = g_ID + " " + value + " " +
				student + " " + course;
		return result;
		
	}
	
}
	






