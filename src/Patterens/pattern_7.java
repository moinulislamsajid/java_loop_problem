package Patterens;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
