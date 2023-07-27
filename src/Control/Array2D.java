package Control;

public class Array2D {

	public static void main(String[] args) 
	{
		int arr[][]= { {10,20,30},{40,49,22},{47,229,43}};
		
		System.out.println("Print 2d array using NESTED FOR LOOP ---");
		
		for(int i=0;i<3;i++)//rows
		{
			for(int j=0;j<3;j++)//columns
			{
				System.out.print(arr[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		System.out.println("---Enchanced For loop-----");//readymade or predefined loop
		
		for(int r[]:arr)
		{
			for(int c:r)
			{
				System.out.print(c +"    ");
				
			}
			System.out.println();
		}
		

	}

}
