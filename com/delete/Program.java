package com.delete;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

//Student class
class Student {
	String name;
	Double marks;

	Student (String name, double marks){
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString(){
		return name+" marks is "+marks;
	}
}

//Classes for Custom sorting
class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student x, Student y){
		return x.name.compareTo(y.name);
	}
}
class SortByMarks implements Comparator<Student>{
	@Override
	public int compare(Student x, Student y){
		return x.marks.compareTo(y.marks);
	}
}

public class Program{
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Tom", 35.54));
		al.add(new Student("Jerry", 29.49));
		al.add(new Student("Alex", 55.91));
		al.add(new Student("Ward", 83.04));
		al.add(new Student("Ford", 40.43));

		for (Student s : al){
			System.out.println(s);
		}
	}
}
