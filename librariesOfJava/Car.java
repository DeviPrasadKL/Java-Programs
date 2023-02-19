package librariesOfJava;

//Program without override the toString() and hashCode()
public class Car {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.toString());
		System.out.println(c);
		
		System.out.println("-----------------");
		System.out.println(c.hashCode());
	}
}