
public class CoinChangeRecusrion {

	public static int recursiveCoinChange(int M, int[] V, int index) {
		if (M < 0) {
			return 0;
		}
		if (M == 0) {
			return 1;
		}

		if(V.length==index) {
			return 0;
		}
		return recursiveCoinChange(M-V[index], V, index) + recursiveCoinChange(M, V, index+1);
	}

	public static void main(String[] args) {
		// 1 1 1 1 1
		//1 1 3
		//2 3
		//2 1 1 1
		//2 2 1
		System.out.println(recursiveCoinChange(210, new int[] {1, 2,3},0));

	}
}
