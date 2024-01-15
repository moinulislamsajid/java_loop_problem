6package Patterens;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i =n; i>=1; i--) {
			
			
			
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
