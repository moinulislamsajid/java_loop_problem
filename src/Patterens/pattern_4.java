package Patterens;

import java.util.Scanner;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		
		// we need to first print while space
		
		for(int i = 1 ; i<=n; i++) {   //	for raw
			
			for(int j = 1; j<=n - i; j++) {     // for column
				
				System.out.print(" ");
			}
			
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		

	}

}
