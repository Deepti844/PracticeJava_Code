package controlstatements;

public class Swappingnum {

	public static void main(String[] args) {
		

		int a =10;
		int b=20;
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a :"+a+"\nb :"+b);
		
		System.out.println("---Without tempvariable---");
		
		int i= 34;
		int j=45;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("\ni :"+i+"\nj :"+j);
	}

}
