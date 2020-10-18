package practice_program;

public class ArrayLeftRotation {

	private static int[] reverse(int ar[], int startIndex, int endIndex) {
		int i=startIndex,j=endIndex;
		while(i<j) {
			int tmp = ar[i];
			ar[i]=ar[j];
			ar[j] = tmp;
			i++;
			j--;
		}
		return ar;
	}
	
	private static void print(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
	}
	private static int [] rotate(int ar[], int noOfRotation) {
		reverse(ar, 0, noOfRotation-1);
		reverse(ar, noOfRotation, ar.length-1);
		reverse(ar, 0, ar.length-1);
		return ar;
	}
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		ar = rotate(ar,4);
		print(ar);

	}

}
