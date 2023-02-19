package practice;

class Demo1{
	static int x = 10;
	int y = 23;

	static void test(){
		System.out.println("Hi");
	}
	void disp(){
		System.out.println("Bye");
	}
}
public class staticandnonStatic {
	public static void main(String[] args) {
		System.out.println(Demo1.x);
		Demo1 d = new Demo1();
		System.out.println(d.x);
		System.out.println(d.y);
		d.test();
		d.disp();
	}
}
