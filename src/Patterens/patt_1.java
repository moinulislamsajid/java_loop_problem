package Patterens;

import java.util.Scanner;

public class patt_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// first we can see that 
		
		// row and col
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {  // for raw
			
			for(int j =1; j<=i; j++) {  // for column
				
				System.out.printf("%c ",i+64);
			}
			
			System.out.print("\n");
		}
		

	}

}
