package Control;
import java.util.Scanner;


public class loops_while {

	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the start to count : ");
		int count =sc.nextInt();
		
		int i=1;
		
		while(i< count)
		{
			System.out.print(" "+i +" ,");
			i++;
		}
		
		

	}

}
