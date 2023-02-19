package collectionsStart;

import java.util.ArrayList;

public class AddAndSet {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(13);
		a.add(25);
		a.add(43);
		
		System.out.println(a);	//[13, 25, 43]
		
//adds 20 to index position 1, already existing object gets shifted to next position
		a.add(1,20);
		System.out.println(a);	//[13, 20, 25, 43]
		
//adds 90 to index position 2, already existing objects gets overriden
		a.set(2, 90);
		System.out.println(a);  //[13, 20, 90, 43]
		
	}
}
