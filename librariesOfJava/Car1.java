package librariesOfJava;

//Program overriding the toString() and hashCode()
public class Car1 {
	@Override
	public String toString(){
		return "Car1@123";
	}
	
	@Override
	public int hashCode(){
		return 123;
	}
	
	public static void main(String[] args) {
		Car1 c = new Car1();
		System.out.println(c.toString());
		System.out.println(c);
		
		System.out.println("----------------------");
		System.out.println(c.hashCode());
	}
}