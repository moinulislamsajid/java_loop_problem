package Patterens;

import java.util.Scanner;

public class patern_5_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i = n; i>=1; i--) {
			
			// print white space 
			for(int j = 1; j<= n - i; j++) {
				
				System.out.print(" ");
			}
			
			// now print the value 
			
			for(int j = 1; j<= i; j++) {
				
				System.out.print("#");
			}
			
			System.out.print("\n");
		}

	}

}
