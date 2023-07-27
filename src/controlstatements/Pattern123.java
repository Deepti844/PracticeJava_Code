package controlstatements;

public class Pattern123 {

	public static void main(String[] args) {
		int sum=1;
		for (int i =1;i<=3;i++)
		{
			for (int j=1;j<=3;j++)
			{
				System.out.print(sum+" ");
				sum++;
			}
			
			System.out.println();
		}

		System.out.println("-----Pattern ABC----");
	char ch = 'A';
		for (int i =1;i<=3;i++)
		{
			for (int j=1;j<=3;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		
	}

}
