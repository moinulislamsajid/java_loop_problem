package loop_problem;

import java.util.Scanner;

public class find_maximum_and_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		
		int hn = Integer.MIN_VALUE,ln=Integer.MAX_VALUE;
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		 
		do {
			
			System.out.print("Enter Number : ");
			num = sc.nextInt();
			
			if(num > hn) {
				hn = num;
			}
			
			if(num < ln) {
				ln = num;
			}
			
			
			
			System.out.print("Do You Want to Continue : ");
			ch = sc.next().charAt(0);
			
		}while(ch == 'y' || ch == 'Y');
		
		
		System.out.println("Maximum Number : "+hn);
		System.out.println("Minimum Number : "+ln);

	}

}
