package loop_problem;

import java.util.Scanner;

public class prime_number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num,count = 0;
		
		System.out.print("Enter Your Number : ");
		num = sc.nextInt();
		
		for(int i = 2; i<=num; i++) {
			if(num %i == 0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.print("Prime Number");
		}
		else {
			
			System.out.print("Not a Prime Number");
		}

	}

}
