package collectionsStart;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConstructorsOfArrayAndLinked {
	public static void main(String[] args) {
		
//Internally an array gets created of size 10 (Default initial capacity)
		ArrayList a = new ArrayList();
	
//Internally an array gets created of size 24 (Custom Capacity)
		ArrayList a1 = new ArrayList(24);
		
//Objects will be stored in the form of nodes
		LinkedList l = new LinkedList();
		
		ArrayList x = new ArrayList();
		x.add(10);
		
//Adding Collections into another Collection
		LinkedList y = new LinkedList(x);
		y.add(20);
		
		ArrayList z = new ArrayList(y);
		z.add(30);
		
		System.out.println(x);	//[10]
		System.out.println(y);	//[10, 20]
		System.out.println(z);	//[10, 20, 30]
	}
}
