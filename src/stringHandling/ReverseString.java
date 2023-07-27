package stringHandling;

public class ReverseString {
	
	static void reverseAString(String inputString) {
		String revString="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			revString=revString+inputString.charAt(i);
			
		}
		System.out.println(inputString);
		System.out.println(revString);
		System.out.println("======================");
	}

	public static void main(String[] args) {
		reverseAString("My name is Deepti");
		reverseAString("Going to school");
		

	}

}
