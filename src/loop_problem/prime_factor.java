package loop_problem;

import java.util.Scanner;

public class prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter your Number : ");
		num = sc.nextInt();
		
		for(int i = 2; i<num; i++) {
			
			while(num %i == 0) {
				System.out.print(i+" ");
				num /= i;
			}
		}
		
		if(num>2) {
			System.out.print(num);
		}

	}

}
