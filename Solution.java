package practice_program;

public class Solution {
	public static void main(String[] args) {
		int N = 5;//scan.nextInt();
		int M = 3;//scan.nextInt();
		int queries[][] = {{1,2,100},
				{2,5,100},
				{3,4,100}};
		long[] array = new long[N + 1];
		while (M-- > 0) {
			int a = queries[M][0];
			int b =  queries[M][1];
			int k =  queries[M][2];;
			array[a - 1] += k;
			array[b] -= k;
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		long sum = 0;
		long max = 0;
		for (int i = 0; i < N; i++) {
			sum += array[i];
			System.out.println("sum = " + sum);
			max = Math.max(max, sum);
		}

		System.out.println("max " + max);
	}
}