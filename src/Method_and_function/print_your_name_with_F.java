package Method_and_function;

import java.util.Scanner;

public class print_your_name_with_F {
	static String name;	
	static void inputMyName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		name = sc.nextLine();
	}
	
	static void printMyName() {
		System.out.print("Name : "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputMyName();
		printMyName();

	}
	
	
	

}
