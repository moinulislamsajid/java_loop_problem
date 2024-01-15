 package loop_problem;

public class sum_evan_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		int sum = 0;
		
		for(int i = 2; i<=n; i+=2) {
			
			 sum = sum + i;
			 System.out.println(i);
			
			
		}
		
		 System.out.println(sum);

	}

}
