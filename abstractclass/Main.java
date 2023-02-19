package abstractclass;
abstract class Demo{
	static int x = 100;
		   int y = 200;
	Demo(){
		System.err.println("Running Constructor of Demo");
	}
	static void disp(){
		System.out.println("Running disp() method");
	}
	void test(){
		System.out.println("Running test() method");
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("X value is "+Demo.x);
		Demo.disp();
		System.out.println("-----------------");
		/*Cannot Access non-static members, 
		 * also cannot Create object of abstract class*/
	}
}
