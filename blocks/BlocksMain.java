package blocks;

public class BlocksMain {
	static int a;
	/*first value assigned is 10
	 * 2nd value is 20
	 * 3rd value is 30
	 * Static blocks are used to initialize static variables
	 * Static blocks are executed before main method	
	 */
	static {
		a=10;
	}
	static {
		a=20;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(a);
		System.out.println("End");
	}
	static {
		a=30;
	}
}
