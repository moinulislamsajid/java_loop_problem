package loop_problem;

import java.util.Scanner;

public class strong_number_up_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,arm;
		while(i<1000) {
			
			arm = amstrong_number(i);
			if(arm==i ) 
				System.out.println(i);
				i++;
			
			
		}
		
		
		
		
	}
	
	 static int amstrong_number(int num) {
		 
		 int sum=0,rem;
		 
		 while(num!=0) {
			 
			 rem = num%10;
			 sum = sum + (rem*rem*rem);
			 num = num/10;
		 }
		 
		 return sum;
		 
	 }
		

}
