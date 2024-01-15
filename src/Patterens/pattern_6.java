package Patterens;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		
		n = sc.nextInt();
		
		// for forent part
		
		for(int i = 1; i<=n; i++) {
			
			// for white space 
			for(int j = 1; j<= n - i; j++) {
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		// for brlow part 
		
		for(int i = n; i>=1; i--) {
			
			for(int j = 1; j<=n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.print("\n");
		}

	}

}
