package statickeywords;

public class Teststudent {

	public static void main(String[] args) 
	
	{
		Student s1 = new Student(101, "Amar");
		Student s2 = new Student(102, "Ben");
		Student s3 = new Student(103, "Chandi");
		
		
		Student.changeclgname();//calling static method with class name //classname.methodname
		s1.displaystudent();
		s2.displaystudent();
		s3.displaystudent();

	}

}
