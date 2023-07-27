package Control;

import java.util.Scanner;

public class Diagonalvalues_2D {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int r =sc.nextInt();
		
		System.out.println("Enter the columns : ");
		int c =sc.nextInt();
		
		System.out.println("Enter "+(r*c)+" values into the array: ");
		
		
		//declare array
		
		int arr[][]= new int [r][c];
		
		// take values into loop
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j] =sc.nextInt();
				
			}
			
		}
		//displaying the values
		
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		
		
//		//enchanced
//		
//		for(int r1[]:arr)
//		{
//			for(int c1:r1)
//			{
//				System.out.print(c1 + "  ");
//			}
//			System.out.println();
//		}
		
		System.out.println("--Diagonal values---");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
				System.out.print(arr[i][j]+"  ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
