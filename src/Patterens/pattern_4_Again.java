package Patterens;

import java.util.Scanner;

public class pattern_4_Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			// for print white space 
			
			for(int j = 1 ; j<= n - i; j++) {
				
				System.out.print(" ");
			}
			
		
			
			// for print value
			
			for(int j = 1; j<=i; j++) {
				
				System.out.print("$");
			}
			System.out.print("\n");
		}

	}

}
