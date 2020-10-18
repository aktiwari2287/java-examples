
public class PrintDiagonalMatrixBetterSolution {
	private static void printMatrixDiagonal(int[][] mat, int m, int n) {
		// n denotes to col
		for(int k=0;k<n;k++) {
			int j=k;
			int i=0;
			while(j>=0) {
				System.out.print(mat[i][j] + "\t");
				j--;
				i++;
			}
			System.out.println();
		}
		
		for(int k=1;k<m;k++) {
			int j=m-1;
			int i=k;
			while(i<n) {
				System.out.print(mat[i][j] + "\t");
				i++;
				j--;
			}
			System.out.println();
		}
	
	} 

	public static void main(String[] args) 
    { 
        int mat[][] = { { 1,	2,	3,	11,	12, 77}, 
                        { 4,	5,	6,	13,	14,	88}, 
                        { 7,	8,	9,	15,	16,	99},
                        {17,	18,	19,	29,	21,	100},
                        {22,	23,	24,	25,	26,	101},
                        {33,	43,	53,	63,	73,	83}};  
        int m=6,n=6;
        printMatrixDiagonal(mat,m,n);
    }
}
