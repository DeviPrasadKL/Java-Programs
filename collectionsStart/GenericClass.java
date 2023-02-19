package collectionsStart;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericClass {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(50);
		a.add(10);
		a.add(30);
		a.add(40);
		
		for(Integer i:a){			//can also use int 
			System.out.println(i);  //10 50 10 30 40 
		}
		
		System.out.println("---------------------------------------");
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Java");
		l.add("SQl");
		l.add("HTML");
		l.add("Apti");
		
		for (String i:l){
			System.out.println(i);  //Java SQl HTML Apti
		}
	}
}
