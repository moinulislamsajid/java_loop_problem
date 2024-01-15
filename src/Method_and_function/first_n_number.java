package Method_and_function;

import java.util.Scanner;

public class first_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int res = adding_Number(n);
		System.out.print("Sum of input given number : "+res);
		

	}
	
	static int adding_Number(int a) {
		
		if(a > 0) {
			return a+adding_Number(a - 1);n
		}else {
			return 0;
		}
		
		
		
	}

}
