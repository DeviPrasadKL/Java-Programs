package abstractclass;

abstract class Demo3{
	int x = 120;
	void test(){
		System.out.println("Running test() method");
	}
	abstract void disp();
	abstract void view();
}
abstract class Sample3 extends Demo3{
	void disp(){
		System.out.println("Defining method body to disp() mehod in Sample 2");
	}
}
class Sample4 extends Sample3{
	void view(){
		System.out.println("Defining method body to view() method in Sample 4 ");
	}
}
public class Main3 {
	public static void main(String[] args) {
		System.out.println("-----------------");
		Sample4 s = new Sample4();
		System.out.println("X value is "+s.x);
		s.test();
		s.disp();
		s.view();
		System.out.println("-----------------");
	}
}
