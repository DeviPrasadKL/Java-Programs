package Inheritance;
class InDemo1 {
	int x = 10;
	void test(){
		System.out.println("Test method is running");
	}
}
class InDemo2 extends InDemo1 {
	int y = 20;
	void disp(){
		System.out.println("Disp method is running");
	}
}
class InDemo3 extends InDemo2 {
	int z = 30;
	void view(){
		System.out.println("View method is running");
	}
}
public class InMain {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		InDemo2 d = new InDemo2();
		System.out.println("X value is "+d.x);
		System.out.println("Y value is "+d.y);
		d.test();
		d.disp();
		System.out.println("------------------");
		InDemo3 d1 = new InDemo3();
		System.out.println("X value is "+d1.x);
		System.out.println("Y value is "+d1.y);
		System.out.println("Z value is "+d1.z);
		d1.test();
		d1.disp();
		d1.view();
		
		System.out.println("Main Ended");
	}
}