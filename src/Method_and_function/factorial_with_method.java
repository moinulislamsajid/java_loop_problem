package Method_and_function;

import java.util.Scanner;

public class factorial_with_method {

	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Any Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		factorial_with_method obj = new factorial_with_method();
		int res = obj.fact(n);
		System.out.println("Factorial : "+res);


	}
	
	int fact(int n) {
		
		if(n == 1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	
	

}
