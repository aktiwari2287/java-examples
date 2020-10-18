package practice_program;

import java.util.HashMap;
import java.util.Map;

public class Fabonacci {
	private Map<Integer, Integer> map = new HashMap<>();

	public Fabonacci() {
		this.map.put(0, 0);
		this.map.put(1, 1);
	}

	private  int dpFabonacci(int n) {
		if (map.containsKey(n)) {
			return map.get(n);
		} 
			map.put(n - 1, dpFabonacci(n - 1));
			map.put(n - 2, dpFabonacci(n - 2));
			int c = map.get(n - 1) + map.get(n - 2);
			map.put(n, c);
		return c;
		
	}

	private static int recursiveFabonacci(int n) {
		if (n == 0)
			return 0;
		if (n==1) {
			return 1;
		}
		return recursiveFabonacci(n - 1) + recursiveFabonacci(n - 2);
	}

	public static void main(String[] args) {
			System.out.println(new Fabonacci().dpFabonacci(6));
			System.out.println(recursiveFabonacci(6));
	}

}
