package Patterens;

import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i = n; i>=1; i--) {      // number of raw
			
			for(int j = 1; j<=i; j++) {  // number of column
				
				System.out.printf("%c ",j+64);
			}
			System.out.print("\n");
		}
		
		
		
	}

}
