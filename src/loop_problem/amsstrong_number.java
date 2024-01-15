package loop_problem;

import java.util.Scanner;

public class amsstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,sum=0,rem,temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number : ");
		num = sc.nextInt();
		
		temp = num;
		
		while(temp > 0) {
			
			rem = temp % 10;
			temp = temp / 10;
			sum = sum + rem * rem * rem;
		}
		
		if(sum==num) {
			System.out.print("THis is a Amstrong Number");
		}else {
			System.out.print("This is not a Amstrong Number");
		}

	}

}
