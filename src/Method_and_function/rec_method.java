package Method_and_function;

public class rec_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rec_method  obj = new rec_method();
		int result = obj.sum(10);
		System.out.println("First Number of Natural Number : "+result);
		

	}
	
	int sum(int a) {
		
		if(a > 0) {
			return a+sum(a-1);
		}else {
			return 0;
		}
	}

}
