package practice_program;
//https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
/**
 *     5 3

    1 2 100

    2 5 100

    3 4 100
 */
import java.util.Arrays;

public class ArrayManipulation {

	static long arrayManipulation1(int n, int[][] queries) {

        long arr[] = new long[n];
       Arrays.fill(arr, 0);
        
        for(int i=0;i<queries.length; i++) {
            int a = queries[i][0]-1;
            int b = queries[i][1]-1;
            int value = queries[i][2];
            while(a<=b) {
                arr[a] = arr[a] + value;
                if(a!=b)
                arr[b] = arr[b] + value;
                a=a+1;
                b=b-1;
            }
            
            for(int j=0;j<arr.length;j++) {
    			System.out.print(arr[j] + " ");
    		}
            System.out.println();
        }
       return Arrays.stream(arr).max().getAsLong();
       
    }
	
	/**
	 *  taking much longer time
	*/
	static long arrayManipulation(int n, int[][] queries) {

		long arr[] = new long[n];
		Arrays.fill(arr, 0);
		
		for(int i=0;i<queries.length; i++) {
			int a = queries[i][0]-1;
			int b = queries[i][1];
			int value = queries[i][2];
			for(int r=a;r<b && r<arr.length;r++) {
				arr[r] = arr[r] + value;
			}
			
			for(int j=0;j<arr.length;j++) {
    			System.out.print(arr[j] + " ");
    		}
            System.out.println();
		}
		long max = Arrays.stream(arr).max().getAsLong();
		return max;
	}

	public static void main(String[] args) {
		int n = 4;
		int queries[][] = {{2,3,603},
							{1,1,286},
							{4,4,882}};
		long max = arrayManipulation1(n, queries);
		System.out.println(max);
	}

}
