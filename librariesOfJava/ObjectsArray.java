package librariesOfJava;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString(){
		return "Employee id of "+name+" is "+id;
	}	
}
class ObjectsArray {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Tom");
		Employee e2 = new Employee(20, "Jerry");
		Employee e3 = new Employee(30, "Alex");
		
		//Creating Array to Store the above objects
		Employee[] emp = {e1,e2,e3};  
//		Or Employee[] emp = new Employee[3];
//		emp[0]= new Employee(10, "Tom");
//		emp[1]= new Employee(20, "Jerry");
//		emp[2]= new Employee(30, "Alex");
		
		for (int i=0; i<emp.length; i++){
			System.out.println(emp[i]);
		}
	}
}
