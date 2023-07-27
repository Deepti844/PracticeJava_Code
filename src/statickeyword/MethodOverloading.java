package statickeyword;

public class MethodOverloading {

	void add(int n1, int n2) {
		System.out.println("Sum is :"+(n1+n2));
	}
	
	void add(float n1, int n2) {
		System.out.println("Sum is :"+(n1+n2));
		
	}
	
	void add(int n1, int n2, int n3) {
		System.out.println("Sum is : "+(n1+n2+n3));
	}
}
