package loop_problem;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number what do you want : ");
		n = sc.nextInt();
		
		for(int i =n; i>=0; i--) {
			System.out.println(i);
		}

	}

}
