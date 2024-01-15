package Patterens;

public class pt_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 10;
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for(int i = n; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
