package statickeyword;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s= new Shape();
		System.out.println("Area of a circle :"+s.area(3.1f));;
		System.out.println("Area of a square :"+s.area(5));
		s.area(3, 4);

	}

}
