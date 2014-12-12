package Question1_2;

public class ReverseString {

	public static String reverseString(String str){
		char[] charArray = str.toCharArray();
		char temp;
		for(int i=0,j=charArray.length-1; i<j; i++,j--){
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;			
		}
		String result = String.copyValueOf(charArray);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("String is apple");
		System.out.println("Reverse is "+ReverseString.reverseString("apple"));
		System.out.println();
		System.out.println("String is banana");
		System.out.println("Reverse is "+ReverseString.reverseString("banana"));
		

	}

}
