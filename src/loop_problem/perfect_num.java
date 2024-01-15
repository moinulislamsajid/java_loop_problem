package loop_problem;

import java.util.Scanner;

public class perfect_num {
	
	// create another mehtod
	
	static boolean check_perfect(int n) {
		
		if(n == 1) {
			return false;
		}
		int sum = 1;
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			return false;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter your number to check perfect or not : ");
		num = sc.nextInt();
		
		if(check_perfect(num)) {
			
			System.out.print("This is a perfect number");
		}else {
			System.out.print("This is Not a Perfect number");
		}
		
		
		

	}

}
