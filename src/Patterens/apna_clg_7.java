package Patterens;

public class apna_clg_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		
		// for upper part
		
		for(int i = 1 ; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
		
		int space = 2 * (n - i);
		
		for(int j = 1; j<=space; j++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j<=i; j++) {
			System.out.print("*");
		}
		
		System.out.print("\n");
		
		}
		// below part
		
		for(int i = n ; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
		
		int space = 2 * (n - i);
		
		for(int j = 1; j<=space; j++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j<=i; j++) {
			System.out.print("*");
		}
		
		System.out.print("\n");

	}

}
}
