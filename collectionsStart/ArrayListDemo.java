package collectionsStart;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add("Java");
		l.add(null);

		System.out.println(l);	//[10, 20, Java, null]
		System.out.println(l.get(2));	//Java
		System.out.println(l.size());	//4
		System.out.println(l.contains("java"));	//false

		System.out.println("--------------------");

		System.out.println(l);	//[10, 20, Java, null]
		l.remove(1);
		System.out.println(l);	//[10, Java, null]

		System.out.println("--------------------");

		System.out.println(l.isEmpty());    //false
		l.clear();
		System.out.println(l.isEmpty());	//true
	}
}