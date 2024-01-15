package loop_problem;

import java.util.Scanner;

public class factorial_vakue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int fact =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number to find out Factorial : ");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			fact = fact * i;
			
			
		}
		System.out.println(fact);
		
		

	}

}
