package practice_program;

import java.util.Arrays;

public class SplitString {

	private static int greater(int ar[]) {
		int max=0;
		int second=0;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				second = max;
				max = ar[i];
			} else if(second<ar[i]) {
				second = ar[i];
			}
		}
		System.out.println(second);
		return max;
	}
	private static int max(int ar[], int start, int max) {
		int tmp=max;
		if(start>ar.length-1) {
			return max;
		}
		else if(tmp<ar[start]) {
			tmp = ar[start];
		}
		return max(ar,start+1,tmp);
	}
	private static int max(int ar[]) {
		return max(ar,0,0);
	}
	
	private static int secondMax(int ar[], int start, int max, int second) {
		int tmp=max;
		if(start>ar.length-1) {
			return second;
		}
		else if(tmp<ar[start]) {
			second = max;
			tmp = ar[start];
		}
		else if(second<ar[start]) {
			second = ar[start];
		}
		return secondMax(ar,start+1,tmp, second);
	}
	private static int secondMax(int ar[]) {
		return secondMax(ar,0,0,0);
	}
	
	
	public static void main(String[] args) {
		int ar[]= {3,1,7,7,2,5};
		System.out.println(secondMax(ar));
	}

}
