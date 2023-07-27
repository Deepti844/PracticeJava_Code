package stringHandling;

public class Practicereverse {
	
	static void sumOfDigit(int inputNumber) {
		int sum =0;
		int rem;
		while(inputNumber>0) {
			rem=inputNumber%10;
			sum= sum+rem;
			inputNumber=inputNumber/10;
		}
	
	
	
	//static void reverseEachWordOfString(String inputString) {
//		String []words= inputString.split(" ");
//		String revString="";
//		for(int i=0;i< words.length;i++) {
//			String word=words[i];
//			String revWord="";
//			for (int j= word.length()-1;j>=0;j--) {
//				revWord =revWord+ word.charAt(j);
//			}
//			revString =revString+revWord+" ";
//		}
//		System.out.println(inputString);
//		System.out.println(revString);
//		System.out.println("====================");
		System.out.println(inputNumber);
		System.out.println("Sum :"+sum);
	}

	public static void main(String[] args) {
		
//		reverseEachWordOfString("My name is Deepti");
//		reverseEachWordOfString("TOday is Wednesday");
		sumOfDigit(123);
		
	}

}
