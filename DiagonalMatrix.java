package practice_program;

public class DiagonalMatrix {

	private static void printMatrixDiagonal(int[][] mat, int m, int n) {
		// n denotes to col
		int k=0;
		for( k=0;k<n;k++) {
			int j=k;
			int i=0;
			while(j>=0) {
				if(i<m)
				System.out.print(mat[i][j] + "\t");
				j--;
				i++;
			}
			System.out.println();
		}
		for(k=1;k<m;k++) {
			int j=n-1;
			int i=k;
			while(i<n && i<m) {
				
				System.out.print(mat[i][j] + "\t");
				i++;
				j--;
			}
			System.out.println();
		}
	
	} 

	public static void main(String[] args) 
    { 
        int mat[][] = { {1,	2,	3},
        				{4,	5,	6},
        				{7,	8,	9},
        				{1,	2,	3}};  
        int m=mat.length,n=mat[0].length;
        printMatrixDiagonal(mat,m,n);
    }
}
