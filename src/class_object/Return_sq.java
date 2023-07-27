package class_object;

public class Return_sq
{
	int num =2;
	
	int calsquare()
	{	
		int sq= num*num;
		return sq;
	}

	public static void main(String[] args)
	{
		Return_sq sq1= new Return_sq();
		int square = sq1.calsquare();
		System.out.println("Square is : " +sq1.calsquare());
		System.out.println("Square is : "+square);
		
		

	}

}
