package abstractclass;

abstract class Demo2{
	int x = 120;
	void test(){
		System.out.println("Running test() method");
	}
	abstract void disp();
}
class Sample2 extends Demo2{
	void disp(){
		System.out.println("Defining method body to disp() mehod in Sample 2");
	}
}
/*Subclass Sample 2 is not an abstract class because body has been defined 
 * to abstract methods inherited from super class Demo2 */
public class Main2 {
	public static void main(String[] args) {
		System.out.println("-----------------");
		Sample2 s = new Sample2();
		System.out.println("X value is "+s.x);
		s.test();
		s.disp();
		System.out.println("-----------------");
	}
}
