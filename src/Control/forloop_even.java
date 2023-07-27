package Control;

import java.util.Scanner;

public class forloop_even {

	public static void main(String[] args)
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit to print the even till the limit : ");
		int limit =sc.nextInt();
		
		for(int i=0;i<=limit;i++)
		{
			 int even=i%2;
			 if(even==0)
			 {
				 System.out.println(i);
			 }
		}
		

	}

}
