package Method_and_function;

import java.util.Scanner;

public class Right_use_to_method {
	
	int a,b;
	int sum = 0;
	Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Right_use_to_method obj = new Right_use_to_method();
		obj.input();
		obj.process();
		obj.output();

	}
	
	void input() {
		
		System.out.print("Enter First Number : ");
		a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		b = sc.nextInt();
		
		
	}
	
	void process() {
		
		sum = a + b;
	}
	
	void output() {
		
		
		System.out.println("Sum : "+sum);
		
	}
	


}
