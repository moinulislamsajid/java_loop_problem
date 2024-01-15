package loop_problem;

public class amstrong_number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1,arm;
		while(i<1000) {
			
			arm = amstrong_Number(i);
			if(arm==i) 
				
				System.out.println(i);
				i++;
			
		}

	}
	
	static int amstrong_Number(int num) {
		
		int sum=0,rem;
		
		while(num!=0) {
			
			rem = num%10;
			num = num/10;
			sum = sum + (rem*rem*rem);
			
		}
		
		return sum;
	}

}
