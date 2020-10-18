package practice_program;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "anand"; //
		System.out.println(reverseString(str)); // dnana
	}

	private static String reverseString(String str) {
		if(str.isEmpty()) return str;
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
