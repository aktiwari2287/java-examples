package practice_program;

import java.util.Arrays;

public class MergeSortedArray {

	private static int [] merge(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		int i,j,k;
		i=j=k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}
	public static void main(String[] args) {

		int a[]= {1,3,5,7,9,31,169};
		int b[]= {2,4,6,8,10,12,23};
		Arrays.stream(merge(a, b)).forEach(System.out::println);
	}

}
