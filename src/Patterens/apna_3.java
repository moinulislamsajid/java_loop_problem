package Patterens;

public class apna_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		// for space print
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= n - i; j++) {
				System.out.print(" ");
			}
			// for star print
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		

	}

}
