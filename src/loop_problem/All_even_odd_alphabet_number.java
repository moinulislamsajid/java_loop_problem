package loop_problem;

public class All_even_odd_alphabet_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// for all even number 
		
		for(int i = 2; i<=100; i+=2) {
			System.out.print(" "+i);
		}
		
		System.out.print("\n\n");
		
		for(int i = 1; i<=100; i+=2) {
			System.out.print(" "+i);
		}
		
		System.out.print("\n\n");
		
		for(char i = 'a'; i<='z'; i++) {
			
			System.out.print(" "+i);
		}

	}

}
