package Patterens;

public class apna_clg_butter_fly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			int space = 2 * (n-i);
			for(int j = 1; j<= space; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		// for below
		for(int i = n; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			int space = 2 * (n-i);
			for(int j = 1; j<= space; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}


	}

}
