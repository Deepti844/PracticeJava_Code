package controlstatements;

public class Arrrays {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		System.out.println("---NORMAL FOR LOOP---");
		for (int i=0;i<3;i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println("---ENCHANCED FOR LOOP---");
		
		for (int a:arr) {
			System.out.println(a);
		}
		
	}

}
