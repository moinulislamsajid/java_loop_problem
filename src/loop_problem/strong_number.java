package loop_problem;

import java.util.Scanner;

public class strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int fact = 1,num;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		
		for(int i = num; i>0; i = i/10) {
			
			for(int j = 1; j<=i %10; j++) {
				
				fact = fact * i;
			}
	       sum = sum + fact;
		}
		
		if(num == sum) {
			
			System.out.println("Strong Number");
		}
		else {
			
			System.out.println("Not a Strong Number");
		}
		
		

	}

}
