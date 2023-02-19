package collectionsStart;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 implements Comparable<Employee2>{
	String name;
	int salary;
	
	Employee2(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return "Salary of "+name+" is "+salary;
	}
	
	@Override
	public int compareTo(Employee2 e){
		return this.salary-e.salary;
	}
}
public class SortEmployeeSal {
	public static void main(String[] args) {
		ArrayList<Employee2> al = new ArrayList<Employee2>();
		al.add(new Employee2("A",55000));
		al.add(new Employee2("B",35000));
		al.add(new Employee2("C",28000));
		al.add(new Employee2("D",25000));
		al.add(new Employee2("E",35000));
		
		Collections.sort(al);
		for(Employee2 e : al){
			System.out.println(e);
		}
		
		System.out.println("-------------------------");
		System.out.println("Lowest salary--> "+al.get(0));
		System.out.println("Highest salary--> "+al.get(al.size()-1));
		
		System.out.println("-------------------------");
		for (int i=0; i<al.size(); i++){
			if(al.get(i).salary>20000 && al.get(i).salary<30000){
				System.out.println(al.get(i));
			}
		}
	}
}




























