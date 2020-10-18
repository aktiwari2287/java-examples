/*
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5
 */
public class ArrayPattern {
	int table[][];
	int n;

	ArrayPattern(int n) {
		this.n = n;
		table = new int[n * 2 - 1][n * 2 - 1];
	}

	public void pattern() {
		int tmp = n;
		int k=0;
		int len=0;
		int n = tmp*2-1;
		for(;tmp>=1;tmp--) {
			int i=k,j=k;
			//move right
			for(;j<n;j++) {
				table[i][j]=tmp;
			}
			j--;
			//move bottom
			for(;i<n;i++) {
				table[i][j]=tmp;
			}
			// move left
			i--;
			for(;j>=k;j--) {
				table[i][j]=tmp;
			}
			// move up
			j++;
			for(;i>=k;i--) {
				table[i][j]=tmp;
			}
			n=n-1;
			k++;
		}
		
	}

	public void print() {
		for(int a=0;a<table.length;a++) {
			for(int b=0;b<table.length;b++) {
				System.out.print(table[a][b] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayPattern a = new ArrayPattern(9);
		a.pattern();
		a.print();

	}

}
