package Patterens;

public class apna_clg_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= 2 * i - 1; j++) {
				System.out.printf("%d ",i);
			}
			System.out.print("\n");
		}

	}

}
