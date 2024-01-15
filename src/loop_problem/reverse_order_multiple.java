package loop_problem;

import java.util.Scanner;

public class reverse_order_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number to find reverse table : ");
		n = sc.nextInt();
		
		for(int i = 10; i>=0; i--) {
			
			int answer = i * n;
			System.out.println(i + " X "+n+" = "+answer);
		}
		

	}

}
