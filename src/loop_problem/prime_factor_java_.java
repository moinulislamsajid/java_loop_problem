package loop_problem;

import java.util.Scanner;

public class prime_factor_java_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num;
		num = sc.nextInt();
		
		for(int i =2; i<num;i++) {
			while(num%i ==0) {
				System.out.println(i +" ");
				num/=i;
			}
		}
		if(num>2) {
			System.out.println(num);
		}

	}

}
