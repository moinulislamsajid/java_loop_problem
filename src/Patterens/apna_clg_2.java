package Patterens;

public class apna_clg_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for(int i = 1;i<=n; i++) { // for raw
			for(int j = 1; j<=n; j++) { // for column
				if(i == 1 || i ==n || j == 1 || j == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}

}
