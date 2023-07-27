package basicprograms;
import java.util.Scanner;

public class control_loops {

	public static void main(String[] args) 
	
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("YOur age is :" +age);
		
		if (age >=18)
		{
			System.out.println("You are "+ age +" years old, so you can vote");
			
		}
		else
		{
			System.out.println("You are "+ age +" years old, so you CAN'T vote");
		}
		

	}

}
