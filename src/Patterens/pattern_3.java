package Patterens;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {  // number of raw
			
			for(int j = 1; j<=i; j++) {  // number of column
				
				System.out.printf("%d ",j);
			}
			
			System.out.print("\n");
		}
		
		for(int i = n; i>=1; i--) {
			
			for(int j =1; j<=i; j++) {
				
				System.out.printf("%d ",j);
			}
			
			System.out.print("\n");
		}

	}

}
