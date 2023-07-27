package stringHandling;

public class ReverseEachWord {
	static void reverseEachWordOfString(String inputString) {
	String []words =inputString.split(" ");
	String revString="";
	
	for(int i =0;i<words.length;i++) {
		String word =words[i];
		String revWord="";
		
		for(int j=word.length()-1;j>=0;j--) {
			revWord=revWord+word.charAt(j);
			
		}
			revString=revString+revWord+" ";
							
	}
	
	System.out.println(inputString);
	System.out.println(revString);
	System.out.println("======================");
}
	
	public static void main(String[] args) {
		reverseEachWordOfString("Java is a program");
		reverseEachWordOfString("Python is also a program");
		
	}
}
	


