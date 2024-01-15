package loop_problem;

import java.util.Scanner;

public class AmStriongNumber_Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num,sum=0,temp,rem;
		
		System.out.print("Enter your Number : ");
		num = sc.nextInt();
		
		
		temp = num;
		
		while(temp > 0) {
			
			rem = temp % 10;
			temp = temp / 10;
			sum = sum + rem * rem * rem;
		}
		
		if(num==sum) {
			System.out.print("This Amstrong Number");
		}else {
			System.out.print("This Not a Amstrong Number");
		}

	}

}
