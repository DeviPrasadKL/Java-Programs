package librariesOfJava;
//Overriding the equals() to compare the attributes of 2 objects

class Student {
	int age;

	Student(int age){
		this.age=age;
	}
	@Override
	public boolean equals(Object obj){
		Student s = (Student)obj;
		return this.age==s.age;
	}
}
public class Demo {
	public static void main(String[] args) {
		Student s1 = new Student(20);
		Student s2 = new Student(20);
		
		System.out.println(s1.equals(s2));
	}
}
