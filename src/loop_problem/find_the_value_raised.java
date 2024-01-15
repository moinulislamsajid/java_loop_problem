package loop_problem;

import java.util.Scanner;

public class find_the_value_raised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base,power,answer=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter Base : ");
		base = sc.nextInt();
		System.out.print("Enter Power : ");
		power = sc.nextInt();
		
		for(int i = 1; i<=power; i++) {
			
			answer = answer * base;
		}
		
		System.out.println(answer);

	}

}
