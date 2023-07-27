package basicprograms;
import java.util.Scanner;


public class Largestnum_ifelse 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("\nLargest is "+ n1);
		}
		else
		{
			System.out.println("\nLargest is "+ n2);
		}
		

	}

}
