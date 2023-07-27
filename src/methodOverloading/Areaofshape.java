package methodOverloading;

public class Areaofshape
{
	void area(int l, int b)
	{
		System.out.println("Area of rectangle is : "+(l*b));
	}
	
	int area(int side)
	{
		return (side*side);
	}
	
	float area(float rad)
	{
		return (3.14f*rad*rad);
	}
	

	public static void main(String[] args)
	{
		Areaofshape as =new Areaofshape();
		
		System.out.println("Area of circle is : "+as.area(3.1f));
		
		System.out.println("Area of circle is : "+as.area(3));
		as.area(2, 3);
		

	}

}
