package Inheritance;
class Father {
	int x=10;
}
class Son extends Father{
	int y = 20;
}
class Daughter extends Father{
	int z = 30;
}
public class Instance {
	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		System.out.println(f instanceof Father);
		System.out.println(f instanceof Son);
		System.out.println(f instanceof Daughter);
		System.out.println("------------------------");
		
		System.out.println(f instanceof Father);
		System.out.println(s instanceof Father);
		System.out.println(d instanceof Father);
	}
}
