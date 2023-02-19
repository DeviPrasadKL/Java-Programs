package logical;

import java.util.ArrayList;

public class BinaryRotate {
	public static void main(String[] args) {
		int num = 35;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(num>0){
			int rem = num%2;
			al.add(rem);
			num = num/2;
		}
		System.out.println(al);
		int  n = 0;
		
		for(int i=0; i<al.size(); i++){
			n = (int) (n + Math.pow(2, al.get(i)));
		}
		System.out.println(n);
	}
}
