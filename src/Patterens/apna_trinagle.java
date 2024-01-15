package Patterens;

public class apna_trinagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i == n || j == 1 || i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}

	}

}
