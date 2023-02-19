package collectionsStart;

import java.util.LinkedList;

class Student1{
	int age;
	String name;
	
	Student1(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString(){
		return "Age of "+name+" is "+age;
	}
}
public class Solution {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Tom", 24);
		Student1 s2 = new Student1("Jerry", 23);
		Student1 s3 = new Student1("Alex", 25);
		
		LinkedList<Student1> l = new LinkedList<Student1>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//Traverse in normal for loop
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println("--------------------");
		
		//Traverse using enhanced oe loop
		for(Student1 s :l){
			System.out.println(s);
		}
	}
}
















