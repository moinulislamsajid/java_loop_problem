package loop_problem;

import java.util.Scanner;

public class strong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num,sum=0,rem,temp;
		
	    System.out.print("Enter Your Number : ");
	    num = sc.nextInt();
	    
	    temp = num;
	    
	    while(temp > 0) {
	    	rem = temp % 10;
	    	
	    	int fact = 1;
	    	for(int i = 2; i<=rem; i++) {
	    		fact*=i;
	    	}
	    	
	    	temp = temp/10;
	    	sum = sum + fact;
	    }
	    
	    
	    if(num == sum) {
	    	System.out.print("This is a Strong Number");
	    }else {
	    	System.out.print("This is not a Strong Number");
	    }

	}

}
