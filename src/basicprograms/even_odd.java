package basicprograms;
import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println(num + " is even or odd.?\n");
		
		if (num%2 ==0)
		{
			System.out.println(num + " is EVEN");
		}
		
		else
		{
			System.out.println(num + " is ODD");
		}
	}

}
