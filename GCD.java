package practice_program;

public class GCD {

	private static int gcd(int num1, int num2) {
		int tmp;
		while (num2 != 0) {
			tmp = num2; // tmp = 6
			num2 = num1 % num2; // num2 = 3%6 = 3
			num1 = tmp; // num1 = 6
		}
		return num1;
	}

	private static int Gcd(int num1, int num2) {
		if(num2==0) {
			return num1;
		}
		return Gcd(num2,num1%num2);
	}
	private static int mygcd(int num1, int num2) {
		if(num2==0) {
			return num1;
		}
		else {
			return mygcd(num2, num1%num2);
		}
	}
	public static void main(String[] args) {
		System.out.println(7%16);
		System.out.println(mygcd(3, 6));
	}

}
