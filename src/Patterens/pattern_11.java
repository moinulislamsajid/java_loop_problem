package Patterens;

import java.util.Scanner;

public class pattern_11 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<= 2 * i -1; j++) {
				
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		
		for(int i = n; i>=1; i--) {
			for(int j = 1; j<= n- i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<= 2 * i -1; j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
