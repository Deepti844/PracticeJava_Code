package myinterface;

public class Child implements My_Interfaceparent 
{

	@Override
	public void msg() {
		System.out.println("hi,,Void message..");
		
	}

	@Override
	public int add(int n1, int n2) {
		
		return n1+n2;
	}

}
