package collectionsStart;

import java.util.ArrayList;
import java.util.Collections;

class Employee1{
	String name;
	int salary;

	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString(){
		return "Salary of "+name+" is "+salary;
	}

}
public class EmpSolution {
	public static void main(String[] args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1("Ramesh", 15760);
		Employee1 e2 = new Employee1("Suresh", 20478);
		Employee1 e3 = new Employee1("Tom", 34795);
		Employee1 e4 = new Employee1("Jerry", 10005);

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println(l);

		for (int i=0; i<l.size(); i++){
			for (int j=(i+1); j<l.size(); j++){
				if (l.get(i).salary>l.get(j).salary){
					Collections.swap(l, i, j);
				}
			}
		}
		System.out.println("-----------------------------");
		System.out.println(l);
		System.out.println(l.get(l.size()-1).name);

	}
}

















