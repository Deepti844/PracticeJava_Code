package Control;

import java.util.Scanner;

public class Multiplication_forloop {

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		
		System.out.println("Enter the limit :");
		int limit =sc.nextInt();
		
		for(int i=0;i<=limit;i++)
		{
			System.out.println(num+" * "+i+ " = "+(num*i));
		}
		

	}

}
