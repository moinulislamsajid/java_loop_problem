package loop_problem;

import java.util.Scanner;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			
			if(i%n == 0) {
				
				count++;
				break;
			}
		}
		
		if(count == 0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		

	}

}
