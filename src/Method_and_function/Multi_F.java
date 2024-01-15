package Method_and_function;

import java.util.Scanner;

public class Multi_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int res = calProduct(x,y);
		System.out.print("Result : "+res);

	}
	
	static int calProduct(int a, int b) {
		
		int mul = a * b;
		return mul;
	}

}
