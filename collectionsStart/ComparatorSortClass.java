package collectionsStart;

import java.util.TreeSet;

//Student class
class StudentNew{
	String name;
	int age;
	
	StudentNew(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "Age of "+name+" is "+age;
	}
}

//Main class
public class ComparatorSortClass {
	public static void main(String[] args) {
		StudentNew s1 = new StudentNew("Tom", 24);
		StudentNew s2 = new StudentNew("Jerry", 22);
		StudentNew s3 = new StudentNew("Alex", 25);
		StudentNew s4 = new StudentNew("Ramesh", 20);
		
		//Creatng Objects of sorting class to sort by name or age
		//This is done by passing this object to constructor of TreeSet
		SortByName sn = new SortByName();
		SortByAge sa = new SortByAge();
		
		TreeSet<StudentNew> t = new TreeSet<StudentNew>(sn);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		for(StudentNew s : t){
			System.out.println(s);
		}
		
	}
}


















