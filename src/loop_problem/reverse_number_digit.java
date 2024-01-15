package loop_problem;

import java.util.Scanner;

public class reverse_number_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rem;
		
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		num = sc.nextInt();
		
		while(num>0) {
			
			rem = num%10;
			
			num = num/10;
			
			sum = sum  + rem;
		}
		
		System.out.println(sum);
		

	}

}
