package controlstatements;

public class ReverseWordinString {

	public static void main(String[] args) {
		String inputString =" Go to School";
		String[] words = inputString.split(" ");
		for(int i =0;i<words.length;i++) {
			System.out.println(words[i]); 
		}
		
		String reverseString="";
		
		for(int i =0;i<words.length;i++) {
			String word =words[i];//Go
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword+word.charAt(j);
				
			}
			reverseString=reverseString+ " "+reverseword;
		}
		
		System.out.println("Reverses string is"+reverseString);
	}

}
