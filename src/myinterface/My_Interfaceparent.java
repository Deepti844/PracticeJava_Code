package myinterface;

public interface My_Interfaceparent 

{
	int a=10;
	
	void msg();
	
	int add(int n1, int n2);
	
	static void display()
	{
		System.out.println("hi,,,,Static method..");
	}
	
	default void method()
	{
		System.out.println("hi,,,Default method..");
	}
	

}
