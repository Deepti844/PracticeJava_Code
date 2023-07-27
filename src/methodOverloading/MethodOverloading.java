package methodOverloading;

public class MethodOverloading 
{
	void add(int n1, int n2)
	{
		System.out.println("Sum of 2 num is : "+(n1+n2));
	}
	
	void add(int n1, int n2, int n3)
	{
		System.out.println("Sum of 3 num is : "+(n1+n2+n2));
	}
	
	float add(float n1, int n2)
	{
		return (n1+n2);
	}

	public static void main(String[] args) 
	{
		MethodOverloading m =new MethodOverloading();
		
		System.out.println("Sum is : "+m.add(3.4f, 4));
		m.add(23,34, 1);
		m.add(23, 76, 49);
		
		
		

	}

}
