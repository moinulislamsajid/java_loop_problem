package loop_problem;

import java.util.Scanner;

public class base_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int base,power,answer=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base : ");
		base = sc.nextInt();
		System.out.print("Enter Power : ");
		power = sc.nextInt();
		
		for(int i = 1 ; i<=power; i++) {
			
			answer *= base;
			
		}
		
		System.out.println(answer);
		

	}

}
