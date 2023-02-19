package generalization.specialization;
class Person{
	String name;
	char gender;
	int age;
	
	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}

class Student extends Person{
	String usnid;
	String clgname;
	int marks;
	
	public Student(String name, char gender, int age, String usnid,
			String clgname, int marks) {
		super(name, gender, age);
		this.usnid = usnid;
		this.clgname = clgname;
		this.marks = marks;
	}
}

class Employee extends Person{
	int eid;
	double salary;
	String designation;
	
	public Employee(String name, char gender, int age, int eid, double salary,
			String designation) {
		super(name, gender, age);
		this.eid = eid;
		this.salary = salary;
		this.designation = designation;
	}
}

class Government{
	void aadharenrolment(Person arg){
		System.out.println(arg.name+" enrolling to aadhar");
	}
	void scholarship(Student arg){
		if (arg.marks>75){
			System.out.println(arg.name+" eligible for scolarship");
		}else{
			System.out.println(arg.name+" not eligible for scolarship");
		}
	}
	void taxpayment(Employee arg){
		if (arg.salary>500000.00){
			System.out.println(arg.name+" should pay tax");
		}else{
			System.out.println(arg.name+" not eligible for tax");
		}
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("--------------------------");
		Government gov = new Government();
		Person p = new Person("Ramesh", 'M', 25);
		Student s = new Student("Sneha", 'F', 23, "AMAY903", "JSP", 87);
		Employee e = new Employee("Suresh", 'M', 30, 9234, 34112.3, "Developer");
		
		gov.aadharenrolment(p);
		gov.aadharenrolment(s);
		gov.aadharenrolment(e);
		
		gov.scholarship(s);
		gov.taxpayment(e);
		System.out.println("--------------------------");
	}
}
