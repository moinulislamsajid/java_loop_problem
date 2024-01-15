package loop_problem;

import java.util.Scanner;

public class fibboNacci_Serius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any number : ");
		num = sc.nextInt();
		
		System.out.println("Fibonacci Number : ");
		
		for(int i =1; i<=num; i++) {
			
			a=b;
			b=c;
			c= a+b;
			

			
		}
		System.out.println(c);

	}

}
