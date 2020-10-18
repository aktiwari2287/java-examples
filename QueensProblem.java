package queens_prob;

public class QueensProblem {
	private int noOfQueens;
	private int chessTable[][];

	public QueensProblem(int noOfQueens) {
		this.noOfQueens = noOfQueens;
		chessTable = new int[noOfQueens][noOfQueens];
	}
	
	public void solve() {
		if(setQueens(0)) {
			printQueens();
		} else {
			System.out.println("There is no feasible solution");
		}
	}

	private boolean setQueens(int colIndex) {

		if(colIndex == noOfQueens) return true;
		for(int rowIndex = 0; rowIndex < noOfQueens; ++rowIndex) {
			if(isPlaceValid(rowIndex, colIndex)) {
				chessTable[rowIndex][colIndex] =1 ;
				if(setQueens(colIndex+1)) {
					return true;
				}
				chessTable[rowIndex][colIndex] = 0;
			}
		}
		return false;
	}

	private boolean isPlaceValid(int rowIndex, int colIndex) {

		for(int i=0;i<colIndex;i++) {
			if(chessTable[rowIndex][i] == 1)
				return false;
		}
		for(int i=rowIndex,j=colIndex; i>=0 && j>=0;i--,j--) {
			if(chessTable[i][j]==1) return false;
		}
		for(int i=rowIndex, j=colIndex;i<chessTable.length && j>=0;j--,i++) {
			if(chessTable[i][j] == 1) return false;
		}
		return true;
	}

	private void printQueens() {

		for(int i=0;i<chessTable.length;i++) {
			for(int j=0;j<chessTable.length;j++) {
				if(chessTable[i][j] == 1) {
					System.out.print(" Q ");
				}
				else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
}
