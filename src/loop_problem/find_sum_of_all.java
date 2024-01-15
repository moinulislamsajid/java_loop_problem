package loop_problem;

public class find_sum_of_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 100; i<=200; i++) {
			
			if(i%9 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

	}

}
