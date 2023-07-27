package hierarchicalInheritiance;

public class Student extends Person 
{
	int rollno;
	float marks;
	
	void inputStudent()
	{
		System.out.println("Enter the rollno :");
		rollno = sc.nextInt();
		
		System.out.println("Enter the marks :");
		marks = sc.nextFloat();
	}
	
	void displayStudent()
	{
		System.out.println(name+"  "+age+"  "+rollno+"  "+marks);
	}
}
