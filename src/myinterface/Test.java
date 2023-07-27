package myinterface;

public class Test {

	public static void main(String[] args)
	
	{
		Child ch =new Child();
		ch.add(23, 3);
		System.out.println("The output : "+ch.add(23, 3));
		
		ch.msg();
		ch.method();
		
		My_Interfaceparent.display();
		
		

	}

}
