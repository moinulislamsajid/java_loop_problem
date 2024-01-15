package loop_problem;

import java.util.Scanner;

public class table_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any numbe to print the multiple table : ");
		n = sc.nextInt();
		
		for(int i =0 ; i<=10; i++) {
			
			int answer = i * n;
			System.out.println(i + " X " + n + " = " + answer);
		}
		
		

	}

}
