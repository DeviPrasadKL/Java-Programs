package collectionsStart;

import java.util.ArrayList;

public class GenericsAll {
	public static void main(String[] args) {
		
		//Different Generics
		ArrayList l = new ArrayList(3);
		int a = 34;
		double b = 48.87;
		
		l.add(a);
		l.add(b);
		l.add("Java");
		
		//Traverse through ArrayList l
		for(Object i:l){
			System.out.println(i);	//34 48.87 Java
		}
	}
}
