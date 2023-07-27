package controlstatements;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= new int[] {3,5,4,3,5,3,4,6,6,9,8};
		
		System.out.println("Duplicate elements in the array :");
		
		for (int i =0;i<arr.length;i++) {
			int count=1;
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]== arr[j]) {
					count ++;
					arr[j]=0;
					
				}
			}if (count>1 && arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
