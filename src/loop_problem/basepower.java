package loop_problem;

import java.util.Scanner;

public class basepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int base,power,answer = 1;
		
		System.out.print("Enter Base : ");
		base = sc.nextInt();
		
		System.out.print("Enter Power : ");
		power = sc.nextInt();
		
		for(int  i = 1; i<=power; i++) {
			
			answer = answer * power;
		}
		
		
		System.out.print("Answer Is : "+answer);

	}

}
