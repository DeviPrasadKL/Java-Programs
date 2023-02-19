package collectionsStart;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(40);
		l.add(10);
		l.add(60);
		l.add(50);
		l.add(10);
		l.add(30);

		System.out.println(l);     //[10, 40, 10, 60, 50, 10, 30]
		System.out.println(l.indexOf(10));	//0
		System.out.println(l.lastIndexOf(10));	//5
	}
}

