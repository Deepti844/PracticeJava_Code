package class_object;

import java.util.Scanner;

public class person 
{	 //data members
	String name ;
	int age ;
	String city ;
	
	void inputPerson()//declaration
	{
		Scanner sc = new Scanner(System.in);
		//Definition
		System.out.println("Enter the name :->");
		name= sc.next();
		System.out.println("Enter the age : ->");
		age= sc.nextInt();
		System.out.println("Enter the city :->");
		city = sc.next();
		
	}
	
	void displayPerson()
	{
		System.out.println("The name :->" + name+ "\nThe age : ->" +age+"\nThe city : ->"+city);
	}

	public static void main(String[] args)
	{
		person person =new person();
		person.inputPerson();
		person.displayPerson();
		
		person per =new person();
		per.inputPerson();
		per.displayPerson();

	}

}
