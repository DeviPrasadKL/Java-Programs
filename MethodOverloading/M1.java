package MethodOverloading;

class Method {
	/*Overloading method
	 * with different parameters/args
	 * Same like Constructors
	 */
	public void test(){
		System.out.println("Test with zero arg");
	}
	public void test(int a){
		System.out.println("Test with one int arg");
	}
	public void test(double a){
		System.out.println("Test with one double arg");
	}
	public void test(int a,double b){
		System.out.println("Test with int and double arg");
	}
	public void test(double b,int a){
		System.out.println("Test with double and int arg");
	}
}
public class M1 {
	public static void main(String[] args) {
		Method m = new Method();
		m.test();
		m.test(2);
		m.test(20.4);
		m.test(4, 5.5);
		m.test(5.4, 8);
	}
}