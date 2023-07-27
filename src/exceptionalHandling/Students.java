package exceptionalHandling;

public class Students {
	
	void validMarks(int Marks) throws MarksOutOfRange
	//introduce exception to the class
	{
		if (Marks>100) {
			//create object of the userdefined exception
			throw new MarksOutOfRange("INVALID MARKS");
		}
	}

	public static void main(String[] args) {
		
		Students s = new Students();
		try {
		s.validMarks(600);
		}
		catch(MarksOutOfRange m) {
			m.printStackTrace();
			
		}
		

	}

}
