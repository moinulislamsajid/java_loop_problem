package loop_problem;

import java.util.Scanner;

public class amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num,sum=0,rem,temp;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		temp = num;
		
		while(temp > 0) {
			
			
			rem = temp % 10;
			temp = temp /10;
			
			sum = sum + rem * rem * rem;
			
			
		}
		
		if(num==sum) {
			
			System.out.println("Amstrong Number");
		}else {
			
			System.out.println("Not a Amstrong Number");
		}
		
		
		

	}

}
