package Control;

import java.util.Scanner;

//while example

public class switch_dowhile {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number limit to be printed : ");
		int limit = sc.nextInt();
		
		int i=1;
		int sum=0;
		
		while(i<=limit)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		
		System.out.println("Sum is : "+sum);
		
		

	}

}
