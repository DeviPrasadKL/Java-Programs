package practice;

import java.util.ArrayList;

public class MergeToCenterOfArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {60,70,80};
		
		ArrayList aa = new ArrayList();
		
		for(int i : a){
			aa.add(i);
		}
		System.out.println(aa);
		
		ArrayList ab = new ArrayList();
		
		for(int i : b){
			ab.add(i);
		}
		System.out.println(ab);
		
		
		int[] c = new int[a.length+b.length];
		int aHalf = a.length/2;
		int until = aHalf+b.length-1;
		int x = 0;
		int y = 0;
		
		for (int i=0; i<c.length; i++){
			if(i<aHalf || i>until){
				c[i]=a[y];
				y++;
			}else {
				c[i]=b[x];
				x++;
			}
		}
		
		System.out.println("Merged second array in between first Array");
		ArrayList al = new ArrayList();
		
		for(int i : c){
			al.add(i);
		}
		System.out.println(al);
	}
}
