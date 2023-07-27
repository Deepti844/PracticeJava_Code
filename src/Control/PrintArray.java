package Control;

public class PrintArray {

	public static void main(String[] args)
	
	{	
		int arr[]= {12,23,34,45};
		
		System.out.println("======NORMAL FOR_LOOP===========");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("======ENCHANCED FOR_LOOP===========");
		
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}
