package loop_problem;

import java.util.Scanner;

public class maximum_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		char choice;
		int hn = Integer.MIN_VALUE,ln = Integer.MIN_VALUE;
		
		do {
			System.out.print("Enter Number : ");
			num = sc.nextInt();
			
			if(num > hn) {
				
				hn = num;
				
			}else if(num < ln) {
				
				ln = num;
			}
			
			System.out.print("Do you Want continue (y/n) :  ");
			choice = sc.next().charAt(0);
			
			
		}while(choice == 'y' || choice == 'Y');
		
		
		System.out.print("Maximum Value : "+hn);
		System.out.print("Minimum Value : "+ln);

	}

}
