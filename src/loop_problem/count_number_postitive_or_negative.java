package loop_problem;

import java.util.Scanner;

public class count_number_postitive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number;
		int pc=0,nc=0,zc=0;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("Enter Number : ");
			number = sc.nextInt();
			
			if(number > 0) {
				
				pc++;
			}
			
			else if(number < 0) {
				nc++;
			}
			else {
				
				zc++;
			}
			
			
			System.out.print("Do You Want to Continue y/n : ");
			
			ch = sc.next().charAt(0);
			
			
			
			
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("\n\n====================================== Result ===========================================\n\n");
		System.out.println("Postive Number : "+pc);
		System.out.println("Negative Number : "+nc);
		System.out.println("Zero Number : "+zc);

	}

}
