package abstractclass;

abstract class Demo1{
	int x = 100;
	void test(){
		System.out.println("Running test() method");
	}
}
class Sample1 extends Demo1{
	
}
public class Main1 {
	public static void main(String[] args) {
		System.out.println("-----------------");
		Sample1 s = new Sample1();
		System.out.println("X value is "+s.x);
		s.test();
		System.out.println("-----------------");
		/*Can Access non-static members of abstract class by inheriting 
		 * abstract class to another class and creating 
		 * an object of that class */
	}
}
