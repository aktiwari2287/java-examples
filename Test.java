package practice_program;
//abcd
public class Test {

	public String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0); 
	}
	public static void main(String[] args) {
		System.out.println(new Test().reverse("123456789"));
	}
	
	
	
	
	
	
	
	// a + bcd
	//a+b cd
	//a+b+c d
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
