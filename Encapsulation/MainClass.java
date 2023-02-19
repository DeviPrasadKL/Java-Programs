package Encapsulation;

class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Employee e = new Employee(204, "Ramesh", 20000.54);
		System.out.println("ID value is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		e.setSalary(70056.44);
		System.out.println("Updated sal is "+e.getSalary());
		e.setName("Anand");
		System.out.println("update name is : " +e.getName());
		
		
		System.out.println("Main Ended");
	}
}