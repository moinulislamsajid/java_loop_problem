package loop_problem;

import java.util.Scanner;

public class count_number_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		int pc=0,nc=0,zc=0;
		char choice;
		do {
			
			System.out.print("Enter Number : ");
			num = sc.nextInt();
			
			if(num >0) {
				
				pc++;
			}
			else if(num <0) {
				nc++;
			}
			else {
				zc++;
			}
			
			System.out.print("Do You Want to Continue y/n :  ");
			choice = sc.next().charAt(0);
			
			
		}while(choice == 'y' || choice=='Y');
		
		
		System.out.println("Positive : "+pc);
		System.out.println("Negative : "+nc);
		System.out.println("Zero : "+zc);


	}

}
