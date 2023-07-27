package Control;

import java.util.Scanner;

public class forloop_squaresum {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int limit= sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=limit;i++)
		{
			System.out.println(i*i);
			sum=sum+(i*i);
			
		}

		System.out.println("Sum of squares is : " +sum);

	}

}
