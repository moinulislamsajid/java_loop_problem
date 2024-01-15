package loop_problem;

import java.util.Scanner;

public class perfect_number_ {
	
	
	// create another function
	
	static boolean perfect_number(int n) {
		
		if(n==1) {
			return false;
		}
		
		int sum=1;
		
		for(int i =2;i<n;i++) {
			
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(n==sum) 
			
			return true;
		
		return false;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if(perfect_number(num)) {
			
			System.out.println(num + "  is a perfect number");
		}else {
			
			System.out.println(num  +"  is a not perfect number");
		}
		
		
		
	}

}
