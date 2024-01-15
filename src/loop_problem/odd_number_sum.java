package loop_problem;

public class odd_number_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 100;
		int sum = 0;
		for(int i = 1; i<=n; i+=2) {
			sum = sum + i;
			System.out.println(i);
		}
		
		System.out.println(sum);

	}

}
