package stringHandling;

public class VowelCountInString {
	
	static void vowelCount(String input) {
		int counta=0;
		
		for(int i=0;i<input.length();i++) {
			String inputString=input.toLowerCase();
			if(inputString.charAt(i)=='a'||inputString.charAt(i)=='e'||inputString.charAt(i)=='i'||inputString.charAt(i)=='o'||inputString.charAt(i)=='u') {
				
				counta++;
			}
							
			}
		System.out.println(input);
		System.out.println("Vowel count is: "+counta);
		System.out.println("===============");
		}
	

	public static void main(String[] args) {
		vowelCount("Apple is gOOd");

	}

}
