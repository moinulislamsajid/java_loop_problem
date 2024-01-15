package Method_and_function;

public class add_2_number {
	
	
	static int add(int x, int y) {
		int c;
		c = x + y;
		return c;
	}
	
	private static void showInfo() {
		System.out.println("Hello Method And Function");
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = add(30,20);
		System.out.print(v);
		showInfo();
	}

}
