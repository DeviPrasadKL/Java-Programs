package logical;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort_And_MergeSort {
	public static void main(String[] args) {
		int[] a = {4,3,5,6,2,1};
		boolean swap=false;
		
		for (int i=0; i<a.length-1; i++) {
			swap = true;
			for (int j=0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=false;
				}
			}
			if(swap==true){
				break;
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int j=0; j<a.length; j++) {
			al.add(a[j]);
		}
		System.out.println(al);
	}
}
