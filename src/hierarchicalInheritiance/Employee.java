package hierarchicalInheritiance;

public class Employee extends Person
{
 int empid;
 int sal;
 
 void inputEmployee()
 {
	 System.out.println("Enter the empid : ");
	 empid =sc.nextInt();
	 
	 System.out.println("Enter the sal : ");
	 sal =sc.nextInt();
 }
 
 void displayEmployee() 
 {
	 
	 System.out.println(name+"  "+age+"  "+empid+"  "+sal);
 }
}
