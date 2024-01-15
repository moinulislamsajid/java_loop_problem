package Patterens;

public class apna_clg_axe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i == j || i+j == n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

}
