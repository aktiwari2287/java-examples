public class SetOfCoins {

	public static void countCoins(int[] v, int m) {
		int dpTable[][] = new int[v.length+1][m+1];
		
		
		for(int i=1;i<=m;i++) {
			dpTable[0][i] = 0;
		}
		for(int i=0;i<=v.length;i++) {
			dpTable[i][0] = 1;
		}
		
		for(int i=1;i<=v.length;i++) {
			for(int j=1;j<=m;j++) {
				if(v[i-1]<=j) {
					dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]];
				}
				else{
					dpTable[i][j] = dpTable[i-1][j];
				}
			}
		}
		
		for(int i=0;i<=v.length;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(dpTable[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		countCoins(new int[] { 1, 2, 3 }, 210);
	}

}
