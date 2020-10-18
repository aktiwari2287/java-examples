import java.util.Arrays;

public class RodCutting {
	private int dpTable[][];
	private int price[];
	private int length;
	
	public RodCutting(int[] price, int length) {
		super();
		this.dpTable = new int[price.length+1][length+1];
		this.price = price;
		this.length = length;
	}

	public void profit() {
		for(int i=1;i<price.length;i++) {
			for(int j=1;j<=length;j++) {
				if(i<=j) {
					dpTable[i][j] = Math.max(dpTable[i-1][j], price[i]+dpTable[i-1][j-i]);
				}
				else {
					dpTable[i][j] = dpTable[i-1][j];
				}
			}
		}
		
		for(int i=0;i<price.length;i++) {
			for(int j=0;j<=length;j++) {
				System.out.print(dpTable[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(dpTable[price.length-1][length]);
		
	}

	public static void main(String[] args) {
		int price[] = { 2,5,9,6 }; //5
		int length = 5;
		RodCutting rod = new RodCutting(price, length);
		rod.profit();
	}
}
