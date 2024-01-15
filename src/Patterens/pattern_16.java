package Patterens;

import java.util.Scanner;

public class pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		n = sc.nextInt();
		
		int count =0;
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				
				System.out.printf("%d  ", ++count);
			}
			
			System.out.print("\n");
		}

	}

}
