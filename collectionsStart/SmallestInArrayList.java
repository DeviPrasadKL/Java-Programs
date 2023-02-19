package collectionsStart;
import java.util.ArrayList;

public class SmallestInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(9);
		l.add(48);
		l.add(1);
		l.add(2);
		
		System.out.println(l);
		
		for(int i=0; i<l.size(); i++){
			for (int j=(i+1); j<l.size(); j++){
				if(l.get(i)>l.get(j)){
					int temp = l.get(i);
					l.set(i,l.get(j));
					l.set(j,temp);
				}
			}
		}
		System.out.println(l);
		System.out.println(l.get(0));
	}
}
