package Patterens;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<= n; j++) {
				
				if(i==1 || i == n || j==1 || j == n) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.print("\n");
			
			
		}

	}

}
