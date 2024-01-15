package loop_problem;

import java.util.Scanner;

public class strong_Number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp,sum = 0,rem;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		temp = num;
		
		while(temp > 0) {
			
			rem = temp%10;
			int fact =1;
			for(int i = 1; i<=rem; i++) {
				
				fact*=i;
			}
			
			sum = sum + fact;
			temp = temp / 10;
			
		}
		
		if(num == sum) {
			
			System.out.println("THis is Strong Number");
		}else {
			
			System.out.println("This is N0t a Strong Number");
		}

	}

}
