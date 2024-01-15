package Patterens;

public class apna_clg_2_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;  // number of raw
		int m = 5;  // number of col
		
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j<=m; j++) {
				
				if(i == 1 || i == n || j == 1 || j == m) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
				
				
			}
			
			System.out.print("\n");
		}

	}

}
