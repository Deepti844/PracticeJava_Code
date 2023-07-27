package basicprograms;
import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) 
	
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name= sc.next();
		System.out.println("Your name is : " +name);
		
		

		System.out.println("\nEnter the rollno : ");
		int roll_no= sc.nextInt();
		System.out.println("Your roll no is : " +roll_no);
		
		System.out.println("\nEnter the marks : ");
		float marks= sc.nextFloat();
		System.out.println("Your marks is : " +marks);
		

		System.out.println("\nEnter the email id : ");
		String email= sc.next();
		System.out.println("Your email id is : " +email);
		
		System.out.println("\nEnter the Grade : ");
		char Grade= sc.next().charAt(0);
		System.out.println("Your Grade is : " +Grade);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
