public class SpiralMatrix {

	public static void pattern(int row, int col)  {
		int row1=row, col1=col;
		int table[][] = new int[row][col];
		int k = 1;
		int i = 0, j = 0;
		int x=0, y=1;
		while (k <=row1 * col1) {
			// move right
			for (; j < col; j++) {
				table[i][j] = k;
				k++;
			}
			j--;
			k--;
			// move bottom
			for (; i < row; i++) {
				table[i][j] = k;
				k++;
			}
			i--;
			k--;
			// move left
			for (; j >= x; j--) {
				table[i][j] = k;
				k++;
			}
			j++;
			k--;
			// move up
			for (; i >= y; i--) {
				table[i][j] = k;
				k++;
			}
			row--;
			col--;
			i++;
			j++;
			x++;
			y++;
		}
		print(table, row1, col1);
	}
	public static void print(int table[][],int row, int col) {

		for (int a = 0; a < row; a++) {
			for (int b = 0; b < col; b++) {
				System.out.print(table[a][b] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6, 6);
	

	}

}
