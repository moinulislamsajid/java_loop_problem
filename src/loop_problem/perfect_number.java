package loop_problem;

import java.util.Scanner;

public class perfect_number {
	
	
	static boolean check_perfect(int n) {
		
		if(n == 1) {
			return false;
		}
		
		int sum = 1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter any number to check perfect or not : ");
		num = sc.nextInt();
		
		if(check_perfect(num)) {
			
			System.out.println(num+" is a perfect number");
		}else {
			
			System.out.println(num+" is a not perfect number");
		}
		
		

	}

}
