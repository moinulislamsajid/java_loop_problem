package loop_problem;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num,fact = 1;
		
		System.out.print("Enter your Number : ");
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			
			fact = fact * i;
		}
		
		System.out.print("Factorial Number : "+fact);

	}

}
