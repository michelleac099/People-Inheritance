
public class Student extends Person {

	
	/**
	   A student is represented by the name, birth year, and major.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	private String major;
	
	public Student(String inName, int inYear, String inMajor)
	{
		super(inName, inYear);
		major = inMajor;
	}

	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	   }

}//Student