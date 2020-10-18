package practice_program;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {

	static int pairs(int k, int[] arr) {
        int count=0;
         Set<Integer> set=Arrays.stream(arr).boxed().collect(Collectors.toSet());
         System.out.println(set);
        System.out.println(Arrays.stream(arr).filter(a->set.contains(a-k)).count());
         for(int i=0;i<arr.length;i++) {
             if(set.contains(arr[i]-k)) {
                 count++;
             }
         }
         return count;
        }
	public static void main(String[] args) {
		int [] arr = {1,5,3,4,2};
		System.out.println(pairs(2, arr));
	}
}
