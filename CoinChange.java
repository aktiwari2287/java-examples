
public class CoinChange {

	// m denotes amount
	//v is the set of coins ex { 1, 2 , 3, 4}
	public static void change(int v[], int m) {
	
		long dpTable[][] = new long[v.length+1][m+1];
		for(int i=0;i<=v.length;i++) {
			dpTable[i][0]=1;
		}
		
		for(int i=1;i<=m;i++) {
			dpTable[0][i]=0;
		}
		
		for(int i=1;i<=v.length;i++) {
			for(int j=1;j<=m;j++) {
				
				if(v[i-1]>j) {
					dpTable[i][j] = dpTable[i-1][j];
				}
				else {
					dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]];
				}
			}
		}
		for(int i=0;i<=v.length;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(dpTable[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println(dpTable[v.length][m]);
	}
	public static void main(String[] args) {
		int v[]= {1,2,3};
		int m = 4;
		change(v, m);
		
	}

}
