package polymorphism;

class Demo1{
	int x = 10;
	void test(){
		System.out.println("test() running");
	}
}
class Demo2 extends Demo1{
	int y = 20;
	void disp(){
		System.out.println("disp() running");
	}
}
public class Main {
	public static void main(String[] args) {
		Demo1 d1 =(Demo1) new Demo2();
		System.out.println(d1.x);
		//Demo2 type cast to Demo1
		//Subclass type casted to Superclass-->Upcasting
		Demo2 d2 = (Demo2) d1;
		System.out.println(d2.y);
		//Demo1 type cast to Demo2
		//Superclass type casted to subclass-->Downcasting
		//Only done on the object which has been upcasted
	}
}
