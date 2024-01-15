package loop_problem;

import java.util.Scanner;

public class strong_Number_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num,sum = 0,rem,temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		
		num = sc.nextInt();
		
		temp = num;
		
		while(temp>0) {
			
			rem = temp%10;
			

			int fact = 1;
			for(int i = 1; i <= rem ; i++) {
				
				fact*=i;
			}
			temp = temp/10;
			sum = sum + fact;
			
		}
		
		if(num==sum) {
			
			System.out.println("Strong Number ");
			
		}
		
		else {
			System.out.println("Not a Strong Number");
		}

	}

}
