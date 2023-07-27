package multilevelInheritance;

public class Marks extends Student
{
	 
	char grade;
	
	void grade()
	{
		System.out.println("Enter the grade : ");
		grade =sc.next().charAt(0);
		
	}
	
	
}
