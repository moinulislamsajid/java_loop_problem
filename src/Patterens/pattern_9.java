package Patterens;

import java.util.Scanner;

public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			// for space 
			
			for(int j = 1; j<= n - i; j++) {
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2 * i -1; j++) {
				
				System.out.printf("%d",i);
			}
			
			System.out.print("\n");
		}
		
		
	}

}
