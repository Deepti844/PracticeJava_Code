package Control;

import java.util.Scanner;

public class UserInput_2Darray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row :");
		int r= sc.nextInt();
		
		System.out.println("Enter the column : ");
		int c= sc.nextInt();
		
		//declare the array
		int arr[][]= new int[r][c];
		
		
		
		System.out.println("\nEnter "+(r*c)+" values into the 2D array :-->");
		
		//taking the values from user
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			
			
		}
		
		
		System.out.println("----NORMAL LOOP-----");
		
		//displaying the 2D array elements
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----ENCHANCED LOOP-----");//doubt.....not able to use r and c variables
		
		for(int r1[]:arr)//rows
		{
			for(int c1:r1)
			{
				System.out.print(c1 +" ");
			}
			System.out.println();
		}
		

	}

}
