public class RecamansNumber {

	public static void coinchange(int v[], int m) {
		int table[][] = new int[v.length+1][m+1];
		for(int i=0;i<=v.length;i++) {
			table[i][0]=1;
		}
		for(int i=1;i<=m;i++) {
			table[0][i]=0;
		}
		
		for(int i=1;i<=v.length;i++) {
			for(int j=1;j<=m;j++) {
				if(v[i-1]>j) {
					table[i][j] = table[i-1][j];
				}
				else {
					table[i][j] = table[i-1][j] + table[i][j-v[i-1]];
				}
			}
		}
		for(int i=0;i<=v.length;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(table[v.length][m]);
		
	}
	public static void main(String[] args) {
		int v[]= {1,2,3}, m =4;
		coinchange(v, m);
	}

}
