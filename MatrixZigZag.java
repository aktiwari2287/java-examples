import java.util.stream.IntStream;

/*
0	|	 1	2	3	4
1	|	 5	6	7	8
2	|	 9	10	11	12
3	|	 13	14	15	16
4	|	 17	18	19	20
5	|	 21	22	23	24
6	|	 25 26  27	28
7	|	 29	30	31	32

0,2,4,6
1,3,5, 
output : 1 2 3 4 8 12 11 10 9 13 17 18 19 20 24  
  
 */
public class MatrixZigZag {
	
	public static void printMatrix(int ar[][], int row, int col)
	{
		int i=0,j=0;
		boolean isForward = true;
		for( i=0;i<row;i++) {
			if(i%2==0) {
				if(isForward) {
					for(j=0;j<col;j++) {
						System.out.print(ar[i][j] + " ");
					}
					isForward=false;
					j--;
				}
				else if(!isForward) {
					
					for(;j>=0;j--) {
						System.out.print(ar[i][j]+" ");
					}
					isForward=true;
					j++;
				}
			}
			else {
				System.out.print(ar[i][j] + " ");
			}
		}
	}
	public static void main(String[] args) {
		int [][]ar = createMatrix(6,8);
		printMatrix(ar, ar.length, ar[0].length);
	}
	private static int[][] createMatrix(int row, int col) {
		int ar[][] = new int[row][col];
		int k=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				ar[i][j] = k++;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		return ar;
	}

}
