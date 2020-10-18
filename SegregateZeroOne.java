package practice_program;

import java.util.Arrays;

public class SegregateZeroOne {

	private static int [] merge(int ar[]) {
		
		int tmp[]=new int[ar.length];
		int i=0,k=ar.length-1;
		int j=0;
		while(i<ar.length) {
			if(ar[i]==0) {
				tmp[j]=0;
				j++;
			}
			else {
				tmp[k]=1;
				k--;
			}
			i++;
		}
		return tmp;
	}
	
private static int [] merge2(int ar[]) {
		int tmp[]=new int[ar.length];
		long count = Arrays.stream(ar).filter(a->a==0).count();
		System.out.println(count);
		Arrays.fill(ar, 0,(int)count,0);
		System.out.println();
		Arrays.fill(ar, (int)count,ar.length,1);
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,0,1,0,1,0,1,1,1,1};
		Arrays.stream(merge2(ar)).forEach(System.out::println);
	}

}
