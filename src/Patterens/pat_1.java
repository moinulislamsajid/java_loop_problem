package Patterens;

public class pat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i = n; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("^");
			}
			System.out.print("\n");
		}

	}

}
