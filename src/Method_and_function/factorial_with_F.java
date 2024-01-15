package Method_and_function;

import java.util.Scanner;

public class factorial_with_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter Number : ");
		n = sc.nextInt();
		
		int res = calFact(n);
		
		System.out.print("Factorial Value : "+res);
		
		
	}
	
	static int calFact(int a) {
		
		if(a == 1) {
			return 1;
		}else {
			return a*calFact(a - 1);
		}
	}

}
