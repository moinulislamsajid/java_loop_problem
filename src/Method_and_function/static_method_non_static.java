package Method_and_function;

public class static_method_non_static {
	
	
	
	// static method
	
	static void show() {
		
		System.out.println( "Hi I am Static Method" + B);
	}
	
	void check_Method() {
		
		System.out.println(A+" This Is Non Static Method"+B);
	}
	
	int A = 10;
	static int B = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_method_non_static  obj = new static_method_non_static ();
		obj.check_Method();
		show();

	}

}
