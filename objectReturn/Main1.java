package objectReturn;

class Demo1{
	int x = 10;
	void disp(){
		System.out.println("Running disp method");
	}
}
class Sample {
	Demo1 test(){
		System.out.println("Running test method");
		return new Demo1();
	}
}
public class Main1 {
	public static void main(String[] args) {
		Sample s = new Sample();
		Demo1 ref = s.test();
		System.out.println(ref);
		System.out.println("X value is "+ref.x);
		ref.disp();
	}
}
