package Patterens;

import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.printf("%d",j);
			}
			for(int j = i - 1; j>=1; j--) {
				System.out.printf("%d",j);
			}
				
			System.out.print("\n");
				
			
		}

	}

}
