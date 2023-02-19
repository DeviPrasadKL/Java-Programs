package abstraction;

interface Vehicle{
	void start();
	void move();
	void stop();
}

class Bicycle implements Vehicle{

	public void start() {
		System.out.println("Start by peddeling");
	}

	public void move() {
		System.out.println("Move by peddeling");
	}

	public void stop() {
		System.out.println("Stop peddeling and apply breaks");
	}	
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Start by Self start");
	}

	public void move() {
		System.out.println("Gear up and accelerate");
	}

	public void stop() {
		System.out.println("Gear down and apply breaks");
	}
}

class Car implements Vehicle{
	public void start() {
		System.out.println("Start by Self start and ignition");
	}

	public void move() {
		System.out.println("Gear up and accelerate");
	}

	public void stop() {
		System.out.println("Gear down and apply breaks");
	}
}

class Person{
	void travel(Vehicle v1){
		v1.start();
		v1.move();
		v1.stop();
	}
}
public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		Bicycle by = new Bicycle();
		Bike b = new Bike();
		Car c = new Car();
		
		p.travel(by);
		p.travel(b);
		p.travel(c);
	}
}
