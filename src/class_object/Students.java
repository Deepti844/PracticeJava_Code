package class_object;
//using reference variable
public class Students
{
	//data members
	int rollno;
	String name;
	
	void displaydetails()
	{
		System.out.println("The student details : ");
	}
	

	public static void main(String[] args)
	{
		Students s =new Students();
		s.displaydetails();//calling a method using reference variable
		
		s.rollno=101;
		s.name="Alice";// initialization using reference variable
		System.out.println(s.rollno +" "+ s.name);
		//calling the variables using reference variable( here s, for Students)

	}

}
