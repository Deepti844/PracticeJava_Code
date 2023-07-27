package class_object;
// using method
public class Student1 
{
	
	int rollno;
	String name;
//	void inputstudent(int r,String n)
//	{
//		rollno =r;
//		name =n;
//		System.out.println(rollno +" " + name);
//	}
	
	//OR
	
	void inputstudent(int rollno,String name)
	{
		//this-> a keyword which points to the class variables
		this.rollno = rollno;
		this.name = name;
		System.out.println( rollno+ " "+ name);
	}	
	public static void main(String[] args) 
	{
		Student1 s =new Student1();
		s.inputstudent(21, "Ramesh");
		
	 }

}
